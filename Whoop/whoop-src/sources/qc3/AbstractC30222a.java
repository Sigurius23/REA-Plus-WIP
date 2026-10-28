package qc3;

import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.internal.format.parser.ParseException;
import p715kotlin.jvm.internal.AbstractC22676k;
import s93.AbstractC32309k;
import sc3.C32390d;
import uc3.C34774l;
import uc3.InterfaceC34764b;

/* JADX INFO: renamed from: qc3.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC30222a {
    /* JADX INFO: renamed from: a */
    public abstract C32390d mo92497a();

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC34764b mo92498b();

    /* JADX INFO: renamed from: c */
    public final Object m92499c(String str) {
        String str2;
        try {
            C34774l commands = mo92497a().f134133c;
            AbstractC22676k.m65750j(commands, "commands");
            try {
                return mo92500d(AbstractC32309k.m100576f(commands, str, mo92498b()));
            } catch (IllegalArgumentException e5) {
                String message = e5.getMessage();
                if (message == null) {
                    str2 = "The value parsed from '" + ((Object) str) + "' is invalid";
                } else {
                    str2 = message + " (when parsing '" + ((Object) str) + "')";
                }
                throw new DateTimeFormatException(e5, str2);
            }
        } catch (ParseException e13) {
            throw new DateTimeFormatException(e13, "Failed to parse value from '" + ((Object) str) + '\'');
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract Object mo92500d(InterfaceC34764b interfaceC34764b);
}
