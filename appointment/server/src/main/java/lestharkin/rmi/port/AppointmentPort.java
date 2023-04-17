package lestharkin.rmi.port;

public interface AppointmentPort {
  public Appointment openAppointment();
  public boolean closeAppointment(String id);
  public boolean cancelAppointment(String id);
  public Appointment getAppointmentById(String id);
  public Appointment[] getAppointmentAll();
}
