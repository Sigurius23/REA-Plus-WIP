package wa3;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p715kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: wa3.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC36986c implements InterfaceC37021x {
    static {
        int i13 = C36998i.f158346b;
    }

    /* JADX INFO: renamed from: b */
    public static void m118733b(InterfaceC37019v interfaceC37019v) throws InvalidProtocolBufferException {
        if (interfaceC37019v == null || interfaceC37019v.mo92260b()) {
            return;
        }
        InvalidProtocolBufferException invalidProtocolBufferExceptionM65785a = (interfaceC37019v instanceof AbstractC36984b ? new UninitializedMessageException() : new UninitializedMessageException()).m65785a();
        invalidProtocolBufferExceptionM65785a.f89345w = interfaceC37019v;
        throw invalidProtocolBufferExceptionM65785a;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC37019v m118734c(ByteArrayInputStream byteArrayInputStream, C36998i c36998i) throws InvalidProtocolBufferException {
        InterfaceC37019v interfaceC37019v;
        try {
            int i13 = byteArrayInputStream.read();
            if (i13 == -1) {
                interfaceC37019v = null;
            } else {
                if ((i13 & 128) != 0) {
                    i13 &= 127;
                    int i14 = 7;
                    while (true) {
                        if (i14 < 32) {
                            int i15 = byteArrayInputStream.read();
                            if (i15 == -1) {
                                throw InvalidProtocolBufferException.m65783b();
                            }
                            i13 |= (i15 & 127) << i14;
                            if ((i15 & 128) == 0) {
                                break;
                            }
                            i14 += 7;
                        } else {
                            while (true) {
                                if (i14 >= 64) {
                                    throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
                                }
                                int i16 = byteArrayInputStream.read();
                                if (i16 == -1) {
                                    throw InvalidProtocolBufferException.m65783b();
                                }
                                if ((i16 & 128) == 0) {
                                    break;
                                }
                                i14 += 7;
                            }
                        }
                    }
                }
                C36992f c36992f = new C36992f(new C36982a(byteArrayInputStream, i13));
                InterfaceC37019v interfaceC37019v2 = (InterfaceC37019v) mo92259a(c36992f, c36998i);
                try {
                    c36992f.m118755a(0);
                    interfaceC37019v = interfaceC37019v2;
                } catch (InvalidProtocolBufferException e5) {
                    e5.f89345w = interfaceC37019v2;
                    throw e5;
                }
            }
            m118733b(interfaceC37019v);
            return interfaceC37019v;
        } catch (IOException e13) {
            throw new InvalidProtocolBufferException(e13.getMessage());
        }
    }
}
