package tc.oc.chatmoderator.listeners;

import com.google.common.base.Preconditions;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import tc.oc.chatmoderator.events.ViolationAddEvent;

/**
 * Listener for debug-related events. Only listening when registered (and only registered when debug mode is enabled).
 */
public class DebugListener implements Listener {
    @EventHandler(priority = EventPriority.MONITOR)
    public void onViolationAdd(final ViolationAddEvent event) {
        Bukkit.broadcastMessage(Preconditions.checkNotNull(event, "Event").getViolation().toString());
    }
}
