package processing.mode.android;

import java.util.List;

public interface DeviceListener {
  void stackTrace(final List<String> trace);

  void sketchStopped();
}
