.class public final Lio/getstream/chat/android/client/api/ProxyChatApi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/api/ChatApi;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d0\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J-\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0096\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u000eH\u0096\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J8\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0097\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ8\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0097\u0001\u00a2\u0006\u0004\u0008 \u0010\u001fJ.\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u001e\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010!\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0004\u0008\"\u0010$J.\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010!\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0004\u0008%\u0010#J\u001e\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010!\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0004\u0008%\u0010$J(\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0008\u0010&\u001a\u0004\u0018\u00010\u001bH\u0097\u0001\u00a2\u0006\u0004\u0008\'\u0010(J(\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0008\u0010&\u001a\u0004\u0018\u00010\u001bH\u0097\u0001\u00a2\u0006\u0004\u0008)\u0010(J\u001e\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010+\u001a\u00020*H\u0097\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u001e\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010.\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0004\u0008/\u0010$J\u001c\u00101\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020*000\u000eH\u0097\u0001\u00a2\u0006\u0004\u00081\u0010\u0018J\u001e\u00105\u001a\u0008\u0012\u0004\u0012\u0002040\u000e2\u0006\u00103\u001a\u000202H\u0097\u0001\u00a2\u0006\u0004\u00085\u00106J\u001e\u00109\u001a\u0008\u0012\u0004\u0012\u0002040\u000e2\u0006\u00108\u001a\u000207H\u0097\u0001\u00a2\u0006\u0004\u00089\u0010:J&\u0010<\u001a\u0008\u0012\u0004\u0012\u0002040\u000e2\u0006\u0010;\u001a\u00020\t2\u0006\u00103\u001a\u000202H\u0097\u0001\u00a2\u0006\u0004\u0008<\u0010=J&\u0010>\u001a\u0008\u0012\u0004\u0012\u0002040\u000e2\u0006\u0010;\u001a\u00020\t2\u0006\u00108\u001a\u000207H\u0097\u0001\u00a2\u0006\u0004\u0008>\u0010?JT\u0010J\u001a\u0008\u0012\u0004\u0012\u00020I0\u000e2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020@2\u0008\u0010D\u001a\u0004\u0018\u00010C2\u0008\u0010E\u001a\u0004\u0018\u00010C2\u0008\u0010F\u001a\u0004\u0018\u00010\t2\u000e\u0010H\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010GH\u0097\u0001\u00a2\u0006\u0004\u0008J\u0010KJ4\u0010N\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c000\u000e2\u0006\u0010L\u001a\u00020\t2\u0006\u0010M\u001a\u00020\t2\u0006\u0010E\u001a\u00020CH\u0097\u0001\u00a2\u0006\u0004\u0008N\u0010OJ,\u0010P\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c000\u000e2\u0006\u0010L\u001a\u00020\t2\u0006\u0010E\u001a\u00020CH\u0097\u0001\u00a2\u0006\u0004\u0008P\u0010QJ6\u0010T\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c000\u000e2\u0006\u0010R\u001a\u00020\t2\u0006\u0010E\u001a\u00020C2\u0008\u0010S\u001a\u0004\u0018\u00010\tH\u0097\u0001\u00a2\u0006\u0004\u0008T\u0010UJ4\u0010W\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020V000\u000e2\u0006\u0010L\u001a\u00020\t2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020CH\u0097\u0001\u00a2\u0006\u0004\u0008W\u0010XJL\u0010[\u001a\u0008\u0012\u0004\u0012\u00020Z0\u000e2\u0006\u0010L\u001a\u00020\t2\u0008\u0010Y\u001a\u0004\u0018\u00010@2\u0008\u0010E\u001a\u0004\u0018\u00010C2\u0008\u0010F\u001a\u0004\u0018\u00010\t2\u000e\u0010H\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010GH\u0097\u0001\u00a2\u0006\u0004\u0008[\u0010\\J.\u0010a\u001a\u0008\u0012\u0004\u0012\u00020V0\u000e2\u0006\u0010]\u001a\u00020V2\u0006\u0010_\u001a\u00020^2\u0006\u0010`\u001a\u00020^H\u0097\u0001\u00a2\u0006\u0004\u0008a\u0010bJ&\u0010d\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000e2\u0006\u0010L\u001a\u00020\t2\u0006\u0010c\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0004\u0008d\u0010eJ.\u0010h\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000e2\u0006\u0010L\u001a\u00020\t2\u0006\u0010f\u001a\u00020^2\u0006\u0010g\u001a\u00020^H\u0097\u0001\u00a2\u0006\u0004\u0008h\u0010iJ\u001e\u0010l\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000e2\u0006\u0010k\u001a\u00020jH\u0097\u0001\u00a2\u0006\u0004\u0008l\u0010mJ\u001e\u0010n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000e2\u0006\u0010L\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0004\u0008n\u0010$J\u001e\u0010p\u001a\u0008\u0012\u0004\u0012\u00020o0\u000e2\u0006\u0010L\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0004\u0008p\u0010$J.\u0010r\u001a\u0008\u0012\u0004\u0012\u00020q0\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020qH\u0097\u0001\u00a2\u0006\u0004\u0008r\u0010sJ.\u0010t\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020qH\u0097\u0001\u00a2\u0006\u0004\u0008t\u0010sJ0\u0010u\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020q000\u000e2\u0008\u0010D\u001a\u0004\u0018\u00010C2\u0008\u0010E\u001a\u0004\u0018\u00010CH\u0097\u0001\u00a2\u0006\u0004\u0008u\u0010vJ@\u0010y\u001a\u0008\u0012\u0004\u0012\u00020x0\u000e2\u0006\u0010Y\u001a\u00020@2\u0008\u0010E\u001a\u0004\u0018\u00010C2\u0008\u0010F\u001a\u0004\u0018\u00010\t2\u000c\u0010H\u001a\u0008\u0012\u0004\u0012\u00020w0GH\u0097\u0001\u00a2\u0006\u0004\u0008y\u0010zJ0\u0010|\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0008\u0010{\u001a\u0004\u0018\u00010CH\u0097\u0001\u00a2\u0006\u0004\u0008|\u0010}J&\u0010~\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0004\u0008~\u0010eJ\u001f\u0010\u007f\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0097\u0001\u00a2\u0006\u0005\u0008\u007f\u0010\u0080\u0001JP\u0010\u0086\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000e2\u0006\u0010L\u001a\u00020\t2\u0015\u0010\u0083\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u00012\r\u0010\u0084\u0001\u001a\u0008\u0012\u0004\u0012\u00020\t002\u0007\u0010\u0085\u0001\u001a\u00020^H\u0097\u0001\u00a2\u0006\u0006\u0008\u0086\u0001\u0010\u0087\u0001J(\u0010\u0088\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u0088\u0001\u0010eJO\u0010\u008b\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c000\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010E\u001a\u00020C2\u000c\u0010H\u001a\u0008\u0012\u0004\u0012\u00020\u000c0G2\u0008\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0097\u0001\u00a2\u0006\u0006\u0008\u008b\u0001\u0010\u008c\u0001J$\u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\u000e2\u0008\u0010\u008e\u0001\u001a\u00030\u008d\u0001H\u0097\u0001\u00a2\u0006\u0006\u0008\u0090\u0001\u0010\u0091\u0001J0\u0010\u0094\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0092\u0001000\u000e2\u000e\u0010\u0093\u0001\u001a\t\u0012\u0005\u0012\u00030\u0092\u000100H\u0097\u0001\u00a2\u0006\u0006\u0008\u0094\u0001\u0010\u0095\u0001J!\u0010\u0097\u0001\u001a\t\u0012\u0005\u0012\u00030\u0096\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u0097\u0001\u0010$J \u0010\u0098\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u0098\u0001\u0010$J\u001f\u0010\u0099\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0096\u0001000\u000eH\u0097\u0001\u00a2\u0006\u0005\u0008\u0099\u0001\u0010\u0018JN\u0010\u009a\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0092\u0001000\u000e2\u0006\u0010.\u001a\u00020\t2\u0015\u0010\u0083\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u00012\r\u0010\u0084\u0001\u001a\u0008\u0012\u0004\u0012\u00020\t00H\u0097\u0001\u00a2\u0006\u0006\u0008\u009a\u0001\u0010\u009b\u0001J4\u0010\u009e\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0008\u0010\u008e\u0001\u001a\u00030\u009c\u0001H\u0096\u0001\u00a2\u0006\u0006\u0008\u009e\u0001\u0010\u009f\u0001JK\u0010\u00a1\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0015\u0010\u00a0\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u00012\u0008\u0010\u007f\u001a\u0004\u0018\u00010\u000cH\u0097\u0001\u00a2\u0006\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001JP\u0010\u00a3\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0015\u0010\u0083\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u00012\r\u0010\u0084\u0001\u001a\u0008\u0012\u0004\u0012\u00020\t00H\u0097\u0001\u00a2\u0006\u0006\u0008\u00a3\u0001\u0010\u00a4\u0001J2\u0010\u00a6\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0007\u0010\u00a5\u0001\u001a\u00020CH\u0097\u0001\u00a2\u0006\u0005\u0008\u00a6\u0001\u0010OJ)\u0010\u00a7\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u00a7\u0001\u0010eJ\u0019\u0010\u00a9\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a8\u00010\u000eH\u0096\u0001\u00a2\u0006\u0005\u0008\u00a9\u0001\u0010\u0018J0\u0010\u00aa\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010L\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u00aa\u0001\u0010#J(\u0010\u00ac\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\r\u0010\u00ab\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000c00H\u0097\u0001\u00a2\u0006\u0006\u0008\u00ac\u0001\u0010\u0095\u0001J1\u0010\u00ae\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0007\u0010\u00ad\u0001\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u00ae\u0001\u0010#JI\u0010\u00b0\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0008\u0010L\u001a\u0004\u0018\u00010\t2\t\u0010\u00af\u0001\u001a\u0004\u0018\u0001072\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\tH\u0097\u0001\u00a2\u0006\u0006\u0008\u00b0\u0001\u0010\u00b1\u0001J(\u0010\u00b2\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u00b2\u0001\u0010eJ2\u0010\u00b4\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0007\u0010\u00b3\u0001\u001a\u00020^H\u0097\u0001\u00a2\u0006\u0006\u0008\u00b4\u0001\u0010\u00b5\u0001J4\u0010\u00b7\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\t\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u000cH\u0097\u0001\u00a2\u0006\u0005\u0008\u00b7\u0001\u0010\u0010J)\u0010\u00b8\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u00b8\u0001\u0010eJ\u0019\u0010\u00ba\u0001\u001a\t\u0012\u0005\u0012\u00030\u00b9\u00010\u000eH\u0097\u0001\u00a2\u0006\u0005\u0008\u00ba\u0001\u0010\u0018J\u0018\u0010\u00bb\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000eH\u0097\u0001\u00a2\u0006\u0005\u0008\u00bb\u0001\u0010\u0018J3\u0010\u00bc\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0008\u0010\r\u001a\u0004\u0018\u00010\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u00bc\u0001\u0010#J)\u0010\u00bd\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u00bd\u0001\u0010eJ\u0018\u0010\u00be\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000eH\u0097\u0001\u00a2\u0006\u0005\u0008\u00be\u0001\u0010\u0018J*\u0010\u00c1\u0001\u001a\t\u0012\u0005\u0012\u00030\u00c0\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\t2\u0007\u0010\u00bf\u0001\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u00c1\u0001\u0010eJ*\u0010\u00c3\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0092\u0001000\u000e2\u0008\u0010\u00c3\u0001\u001a\u00030\u00c2\u0001H\u0097\u0001\u00a2\u0006\u0006\u0008\u00c3\u0001\u0010\u00c4\u0001Je\u0010\u00c9\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u000e\u0010\u00c6\u0001\u001a\t\u0012\u0005\u0012\u00030\u00c5\u0001002\t\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u000c2\t\u0010\u00c7\u0001\u001a\u0004\u0018\u00010^2\t\u0010\u00c8\u0001\u001a\u0004\u0018\u0001072\u0008\u0010`\u001a\u0004\u0018\u00010^H\u0097\u0001\u00a2\u0006\u0006\u0008\u00c9\u0001\u0010\u00ca\u0001JN\u0010\u00cb\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\r\u0010\u00c6\u0001\u001a\u0008\u0012\u0004\u0012\u00020\t002\t\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u000c2\u0008\u0010`\u001a\u0004\u0018\u00010^H\u0097\u0001\u00a2\u0006\u0006\u0008\u00cb\u0001\u0010\u00cc\u0001JN\u0010\u00cd\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\r\u0010\u00c6\u0001\u001a\u0008\u0012\u0004\u0012\u00020\t002\t\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u000c2\u0008\u0010`\u001a\u0004\u0018\u00010^H\u0097\u0001\u00a2\u0006\u0006\u0008\u00cd\u0001\u0010\u00cc\u0001JX\u0010\u00cf\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ce\u00010\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0015\u0010\u0083\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u00012\r\u0010\u0084\u0001\u001a\u0008\u0012\u0004\u0012\u00020\t00H\u0097\u0001\u00a2\u0006\u0006\u0008\u00cf\u0001\u0010\u00d0\u0001Jg\u0010\u00d1\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00ce\u0001000\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020C2\u0006\u0010Y\u001a\u00020@2\r\u0010H\u001a\t\u0012\u0005\u0012\u00030\u00ce\u00010G2\u000e\u0010\u00c6\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ce\u000100H\u0097\u0001\u00a2\u0006\u0006\u0008\u00d1\u0001\u0010\u00d2\u0001J-\u0010\u00d4\u0001\u001a\t\u0012\u0005\u0012\u00030\u00b9\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\t2\t\u0010\u00d3\u0001\u001a\u0004\u0018\u00010CH\u0097\u0001\u00a2\u0006\u0006\u0008\u00d4\u0001\u0010\u00d5\u0001J \u0010\u00d6\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u00d6\u0001\u0010$JC\u0010\u00da\u0001\u001a\t\u0012\u0005\u0012\u00030\u00d9\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\t2\t\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\t2\u0014\u0010\u00d8\u0001\u001a\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0081\u0001H\u0097\u0001\u00a2\u0006\u0006\u0008\u00da\u0001\u0010\u00db\u0001J!\u0010\u00dc\u0001\u001a\t\u0012\u0005\u0012\u00030\u00d9\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u00dc\u0001\u0010$JC\u0010\u00dd\u0001\u001a\t\u0012\u0005\u0012\u00030\u00d9\u00010\u000e2\u0006\u0010L\u001a\u00020\t2\t\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\t2\u0014\u0010\u00d8\u0001\u001a\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0081\u0001H\u0097\u0001\u00a2\u0006\u0006\u0008\u00dd\u0001\u0010\u00db\u0001J!\u0010\u00de\u0001\u001a\t\u0012\u0005\u0012\u00030\u00d9\u00010\u000e2\u0006\u0010L\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u00de\u0001\u0010$JQ\u0010\u00e1\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\u0007\u0010\u00df\u0001\u001a\u00020\t2\t\u0010\u00d3\u0001\u001a\u0004\u0018\u00010C2\t\u0010\u00d7\u0001\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0007\u0010\u00e0\u0001\u001a\u00020^H\u0097\u0001\u00a2\u0006\u0006\u0008\u00e1\u0001\u0010\u00e2\u0001J;\u0010\u00e3\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\u0007\u0010\u00df\u0001\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0007\u0010\u00e0\u0001\u001a\u00020^H\u0097\u0001\u00a2\u0006\u0006\u0008\u00e3\u0001\u0010\u00e4\u0001Jw\u0010\u00eb\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00ea\u0001000\u000e2\u0006\u0010Y\u001a\u00020@2\r\u0010H\u001a\t\u0012\u0005\u0012\u00030\u00e5\u00010G2\u0008\u0010D\u001a\u0004\u0018\u00010C2\u0008\u0010E\u001a\u0004\u0018\u00010C2\t\u0010\u00e6\u0001\u001a\u0004\u0018\u0001072\t\u0010\u00e7\u0001\u001a\u0004\u0018\u0001072\t\u0010\u00e8\u0001\u001a\u0004\u0018\u0001072\t\u0010\u00e9\u0001\u001a\u0004\u0018\u000107H\u0097\u0001\u00a2\u0006\u0006\u0008\u00eb\u0001\u0010\u00ec\u0001JK\u0010\u00ef\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ee\u00010\u000e2\u0007\u0010\u00ed\u0001\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0016\u0010\u00a0\u0001\u001a\u0011\u0012\u0005\u0012\u00030\u0082\u0001\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u0001H\u0097\u0001\u00a2\u0006\u0006\u0008\u00ef\u0001\u0010\u00f0\u0001J)\u0010\u00f2\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000e2\u0006\u0010L\u001a\u00020\t2\u0007\u0010\u00f1\u0001\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u00f2\u0001\u0010eJ!\u0010\u00f4\u0001\u001a\t\u0012\u0005\u0012\u00030\u00f3\u00010\u000e2\u0006\u0010!\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u00f4\u0001\u0010$J8\u0010\u00f7\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00ee\u0001000\u000e2\r\u0010\u00f5\u0001\u001a\u0008\u0012\u0004\u0012\u00020\t002\u0007\u0010\u00f6\u0001\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0006\u0008\u00f7\u0001\u0010\u00f8\u0001J\"\u0010\u00fb\u0001\u001a\t\u0012\u0005\u0012\u00030\u00fa\u00010\u000e2\u0007\u0010\u00f9\u0001\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u00fb\u0001\u0010$J$\u0010\u00fe\u0001\u001a\t\u0012\u0005\u0012\u00030\u00fd\u00010\u000e2\u0008\u0010\u008e\u0001\u001a\u00030\u00fc\u0001H\u0097\u0001\u00a2\u0006\u0006\u0008\u00fe\u0001\u0010\u00ff\u0001J,\u0010\u0083\u0002\u001a\t\u0012\u0005\u0012\u00030\u0082\u00020\u000e2\u0006\u0010L\u001a\u00020\t2\u0008\u0010\u0081\u0002\u001a\u00030\u0080\u0002H\u0097\u0001\u00a2\u0006\u0006\u0008\u0083\u0002\u0010\u0084\u0002JH\u0010\u0086\u0002\u001a\t\u0012\u0005\u0012\u00030\u0085\u00020\u000e2\u0006\u0010L\u001a\u00020\t2\u0015\u0010\u0083\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u00012\r\u0010\u0084\u0001\u001a\u0008\u0012\u0004\u0012\u00020\t00H\u0097\u0001\u00a2\u0006\u0006\u0008\u0086\u0002\u0010\u009b\u0001J$\u0010\u008a\u0002\u001a\t\u0012\u0005\u0012\u00030\u0089\u00020\u000e2\u0008\u0010\u0088\u0002\u001a\u00030\u0087\u0002H\u0097\u0001\u00a2\u0006\u0006\u0008\u008a\u0002\u0010\u008b\u0002J#\u0010\u008d\u0002\u001a\t\u0012\u0005\u0012\u00030\u0089\u00020\u000e2\u0007\u0010k\u001a\u00030\u008c\u0002H\u0097\u0001\u00a2\u0006\u0006\u0008\u008d\u0002\u0010\u008e\u0002J\"\u0010\u0090\u0002\u001a\t\u0012\u0005\u0012\u00030\u0089\u00020\u000e2\u0007\u0010\u008f\u0002\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u0090\u0002\u0010$J-\u0010\u0093\u0002\u001a\t\u0012\u0005\u0012\u00030\u0091\u00020\u000e2\u0007\u0010\u008f\u0002\u001a\u00020\t2\u0008\u0010\u0092\u0002\u001a\u00030\u0091\u0002H\u0097\u0001\u00a2\u0006\u0006\u0008\u0093\u0002\u0010\u0094\u0002J-\u0010\u0095\u0002\u001a\t\u0012\u0005\u0012\u00030\u0091\u00020\u000e2\u0007\u0010\u008f\u0002\u001a\u00020\t2\u0008\u0010\u0092\u0002\u001a\u00030\u0091\u0002H\u0097\u0001\u00a2\u0006\u0006\u0008\u0095\u0002\u0010\u0094\u0002J*\u0010\u0097\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\u0007\u0010\u008f\u0002\u001a\u00020\t2\u0007\u0010\u0096\u0002\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u0097\u0002\u0010eJQ\u0010\u009a\u0002\u001a\t\u0012\u0005\u0012\u00030\u0099\u00020\u000e2\u0007\u0010\u008f\u0002\u001a\u00020\t2\u0008\u0010Y\u001a\u0004\u0018\u00010@2\u0008\u0010E\u001a\u0004\u0018\u00010C2\u0008\u0010F\u001a\u0004\u0018\u00010\t2\u000f\u0010H\u001a\u000b\u0012\u0005\u0012\u00030\u0098\u0002\u0018\u00010GH\u0097\u0001\u00a2\u0006\u0005\u0008\u009a\u0002\u0010\\JH\u0010\u009c\u0002\u001a\t\u0012\u0005\u0012\u00030\u009b\u00020\u000e2\u0008\u0010Y\u001a\u0004\u0018\u00010@2\u0008\u0010E\u001a\u0004\u0018\u00010C2\u0008\u0010F\u001a\u0004\u0018\u00010\t2\u000f\u0010H\u001a\u000b\u0012\u0005\u0012\u00030\u0089\u0002\u0018\u00010GH\u0097\u0001\u00a2\u0006\u0005\u0008\u009c\u0002\u0010zJ3\u0010\u009d\u0002\u001a\t\u0012\u0005\u0012\u00030\u0098\u00020\u000e2\u0006\u0010L\u001a\u00020\t2\u0007\u0010\u008f\u0002\u001a\u00020\t2\u0007\u0010\u0096\u0002\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u009d\u0002\u0010#J3\u0010\u009f\u0002\u001a\t\u0012\u0005\u0012\u00030\u0098\u00020\u000e2\u0006\u0010L\u001a\u00020\t2\u0007\u0010\u008f\u0002\u001a\u00020\t2\u0007\u0010\u009e\u0002\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u009f\u0002\u0010#J3\u0010\u00a1\u0002\u001a\t\u0012\u0005\u0012\u00030\u0098\u00020\u000e2\u0006\u0010L\u001a\u00020\t2\u0007\u0010\u008f\u0002\u001a\u00020\t2\u0007\u0010\u00a0\u0002\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u00a1\u0002\u0010#JI\u0010\u00a2\u0002\u001a\t\u0012\u0005\u0012\u00030\u0089\u00020\u000e2\u0007\u0010\u008f\u0002\u001a\u00020\t2\u0015\u0010\u0083\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u00012\r\u0010\u0084\u0001\u001a\u0008\u0012\u0004\u0012\u00020\t00H\u0097\u0001\u00a2\u0006\u0006\u0008\u00a2\u0002\u0010\u009b\u0001J\"\u0010\u00a3\u0002\u001a\t\u0012\u0005\u0012\u00030\u0089\u00020\u000e2\u0007\u0010\u008f\u0002\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u00a3\u0002\u0010$J!\u0010\u00a4\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\u0007\u0010\u008f\u0002\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u00a4\u0002\u0010$J,\u0010\u00a7\u0002\u001a\t\u0012\u0005\u0012\u00030\u00a6\u00020\u000e2\u0006\u0010L\u001a\u00020\t2\t\u0010\u00a5\u0002\u001a\u0004\u0018\u000107H\u0097\u0001\u00a2\u0006\u0005\u0008\u00a7\u0002\u0010?J,\u0010\u00a8\u0002\u001a\t\u0012\u0005\u0012\u00030\u00a6\u00020\u000e2\u0006\u0010L\u001a\u00020\t2\t\u0010\u00a5\u0002\u001a\u0004\u0018\u000107H\u0097\u0001\u00a2\u0006\u0005\u0008\u00a8\u0002\u0010?J \u0010\u00a9\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010L\u001a\u00020\tH\u0097\u0001\u00a2\u0006\u0005\u0008\u00a9\u0002\u0010$JC\u0010\u00ab\u0002\u001a\t\u0012\u0005\u0012\u00030\u00aa\u00020\u000e2\u0006\u0010Y\u001a\u00020@2\u0006\u0010E\u001a\u00020C2\u0008\u0010F\u001a\u0004\u0018\u00010\t2\r\u0010H\u001a\t\u0012\u0005\u0012\u00030\u00a6\u00020GH\u0097\u0001\u00a2\u0006\u0006\u0008\u00ab\u0002\u0010\u00ac\u0002J\u001f\u0010\u00ae\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00ad\u0002000\u000eH\u0097\u0001\u00a2\u0006\u0005\u0008\u00ae\u0002\u0010\u0018J$\u0010\u00b0\u0002\u001a\t\u0012\u0005\u0012\u00030\u00ad\u00020\u000e2\u0008\u0010\u00af\u0002\u001a\u00030\u00ad\u0002H\u0097\u0001\u00a2\u0006\u0006\u0008\u00b0\u0002\u0010\u00b1\u0002J$\u0010\u00b2\u0002\u001a\t\u0012\u0005\u0012\u00030\u00ad\u00020\u000e2\u0008\u0010\u00af\u0002\u001a\u00030\u00ad\u0002H\u0097\u0001\u00a2\u0006\u0006\u0008\u00b2\u0002\u0010\u00b1\u0002J\u0013\u0010\u00b3\u0002\u001a\u00020\u0013H\u0096\u0001\u00a2\u0006\u0006\u0008\u00b3\u0002\u0010\u00b4\u0002J\u0013\u0010\u00b5\u0002\u001a\u00020\u0013H\u0096\u0001\u00a2\u0006\u0006\u0008\u00b5\u0002\u0010\u00b4\u0002R\u0015\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0002\u0010\u00b6\u0002R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0004\u0010\u00b7\u0002R\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0006\u0010\u00b8\u0002\u00a8\u0006\u00b9\u0002"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/ProxyChatApi;",
        "Lio/getstream/chat/android/client/api/ChatApi;",
        "delegate",
        "Lbc3/c0;",
        "scope",
        "Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;",
        "sendMessageInterceptor",
        "<init>",
        "(Lio/getstream/chat/android/client/api/ChatApi;Lbc3/c0;Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;)V",
        "",
        "channelType",
        "channelId",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "Lo23/d;",
        "sendMessage",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;",
        "userId",
        "connectionId",
        "Ll83/a0;",
        "setConnection",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "Lio/getstream/chat/android/models/AppSettings;",
        "appSettings",
        "()Lo23/d;",
        "Ljava/io/File;",
        "file",
        "Lio/getstream/chat/android/client/utils/ProgressCallback;",
        "callback",
        "Lio/getstream/chat/android/models/UploadedFile;",
        "sendFile",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;",
        "sendImage",
        "url",
        "deleteFile",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;",
        "(Ljava/lang/String;)Lo23/d;",
        "deleteImage",
        "progressCallback",
        "uploadFile",
        "(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;",
        "uploadImage",
        "Lio/getstream/chat/android/models/Device;",
        "device",
        "addDevice",
        "(Lio/getstream/chat/android/models/Device;)Lo23/d;",
        "id",
        "deleteDevice",
        "",
        "getDevices",
        "Lio/getstream/chat/android/models/PushPreferenceLevel;",
        "level",
        "Lio/getstream/chat/android/models/PushPreference;",
        "setUserPushPreference",
        "(Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;",
        "Ljava/util/Date;",
        "until",
        "snoozeUserPushNotifications",
        "(Ljava/util/Date;)Lo23/d;",
        "cid",
        "setChannelPushPreference",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;",
        "snoozeChannelPushNotifications",
        "(Ljava/lang/String;Ljava/util/Date;)Lo23/d;",
        "Lio/getstream/chat/android/models/FilterObject;",
        "channelFilter",
        "messageFilter",
        "",
        "offset",
        "limit",
        "next",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "sort",
        "Lio/getstream/chat/android/models/SearchMessagesResult;",
        "searchMessages",
        "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;",
        "messageId",
        "firstId",
        "getRepliesMore",
        "(Ljava/lang/String;Ljava/lang/String;I)Lo23/d;",
        "getReplies",
        "(Ljava/lang/String;I)Lo23/d;",
        "parentId",
        "lastId",
        "getNewerReplies",
        "(Ljava/lang/String;ILjava/lang/String;)Lo23/d;",
        "Lio/getstream/chat/android/models/Reaction;",
        "getReactions",
        "(Ljava/lang/String;II)Lo23/d;",
        "filter",
        "Lio/getstream/chat/android/models/QueryReactionsResult;",
        "queryReactions",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;",
        "reaction",
        "",
        "enforceUnique",
        "skipPush",
        "sendReaction",
        "(Lio/getstream/chat/android/models/Reaction;ZZ)Lo23/d;",
        "reactionType",
        "deleteReaction",
        "(Ljava/lang/String;Ljava/lang/String;)Lo23/d;",
        "hard",
        "deleteForMe",
        "deleteMessage",
        "(Ljava/lang/String;ZZ)Lo23/d;",
        "Lio/getstream/chat/android/client/api/models/SendActionRequest;",
        "request",
        "sendAction",
        "(Lio/getstream/chat/android/client/api/models/SendActionRequest;)Lo23/d;",
        "getMessage",
        "Lio/getstream/chat/android/models/PendingMessage;",
        "getPendingMessage",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "createDraftMessage",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;)Lo23/d;",
        "deleteDraftMessage",
        "queryDraftMessages",
        "(Ljava/lang/Integer;Ljava/lang/Integer;)Lo23/d;",
        "Lio/getstream/chat/android/models/DraftsSort;",
        "Lio/getstream/chat/android/models/QueryDraftsResult;",
        "queryDrafts",
        "(Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;",
        "expiration",
        "muteChannel",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;",
        "unmuteChannel",
        "updateMessage",
        "(Lio/getstream/chat/android/models/Message;)Lo23/d;",
        "",
        "",
        "set",
        "unset",
        "skipEnrichUrl",
        "partialUpdateMessage",
        "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Z)Lo23/d;",
        "stopWatching",
        "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;",
        "pagination",
        "getPinnedMessages",
        "(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)Lo23/d;",
        "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
        "query",
        "Lio/getstream/chat/android/client/api/models/QueryChannelsResult;",
        "queryChannels",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lo23/d;",
        "Lio/getstream/chat/android/models/User;",
        "users",
        "updateUsers",
        "(Ljava/util/List;)Lo23/d;",
        "Lio/getstream/chat/android/models/UserBlock;",
        "blockUser",
        "unblockUser",
        "queryBlockedUsers",
        "partialUpdateUser",
        "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;",
        "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
        "Lio/getstream/chat/android/models/Channel;",
        "queryChannel",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)Lo23/d;",
        "extraData",
        "updateChannel",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/Message;)Lo23/d;",
        "updateChannelPartial",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;",
        "cooldownTimeInSeconds",
        "enableSlowMode",
        "disableSlowMode",
        "Lio/getstream/chat/android/models/UnreadCounts;",
        "getUnreadCounts",
        "markRead",
        "messages",
        "markDelivered",
        "threadId",
        "markThreadRead",
        "messageTimestamp",
        "markUnread",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lo23/d;",
        "showChannel",
        "clearHistory",
        "hideChannel",
        "(Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;",
        "systemMessage",
        "truncateChannel",
        "rejectInvite",
        "Lio/getstream/chat/android/models/Mute;",
        "muteCurrentUser",
        "unmuteCurrentUser",
        "acceptInvite",
        "deleteChannel",
        "markAllRead",
        "userName",
        "Lio/getstream/chat/android/models/GuestUser;",
        "getGuestUser",
        "Lio/getstream/chat/android/client/api/models/QueryUsersRequest;",
        "queryUsers",
        "(Lio/getstream/chat/android/client/api/models/QueryUsersRequest;)Lo23/d;",
        "Lio/getstream/chat/android/models/MemberData;",
        "members",
        "hideHistory",
        "hideHistoryBefore",
        "addMembers",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/Boolean;)Lo23/d;",
        "removeMembers",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;)Lo23/d;",
        "inviteMembers",
        "Lio/getstream/chat/android/models/Member;",
        "partialUpdateMember",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;",
        "queryMembers",
        "(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/d;",
        "timeout",
        "muteUser",
        "(Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;",
        "unmuteUser",
        "reason",
        "customData",
        "Lio/getstream/chat/android/models/Flag;",
        "flagUser",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;",
        "unflagUser",
        "flagMessage",
        "unflagMessage",
        "targetId",
        "shadow",
        "banUser",
        "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;",
        "unbanUser",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;",
        "Lio/getstream/chat/android/models/BannedUsersSort;",
        "createdAtAfter",
        "createdAtAfterOrEqual",
        "createdAtBefore",
        "createdAtBeforeOrEqual",
        "Lio/getstream/chat/android/models/BannedUser;",
        "queryBannedUsers",
        "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lo23/d;",
        "eventType",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "sendEvent",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;",
        "language",
        "translate",
        "Lio/getstream/chat/android/models/Attachment;",
        "og",
        "channelIds",
        "lastSyncAt",
        "getSyncHistory",
        "(Ljava/util/List;Ljava/lang/String;)Lo23/d;",
        "fileUrl",
        "Lud3/a1;",
        "downloadFile",
        "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
        "Lio/getstream/chat/android/models/QueryThreadsResult;",
        "queryThreads",
        "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Lo23/d;",
        "Lio/getstream/chat/android/client/api/models/GetThreadOptions;",
        "options",
        "Lio/getstream/chat/android/models/Thread;",
        "getThread",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/GetThreadOptions;)Lo23/d;",
        "Lio/getstream/chat/android/models/ThreadInfo;",
        "partialUpdateThread",
        "Lio/getstream/chat/android/models/CreatePollParams;",
        "createPollParams",
        "Lio/getstream/chat/android/models/Poll;",
        "createPoll",
        "(Lio/getstream/chat/android/models/CreatePollParams;)Lo23/d;",
        "Lio/getstream/chat/android/client/api/models/UpdatePollRequest;",
        "updatePoll",
        "(Lio/getstream/chat/android/client/api/models/UpdatePollRequest;)Lo23/d;",
        "pollId",
        "getPoll",
        "Lio/getstream/chat/android/models/PollOption;",
        "option",
        "createPollOption",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/PollOption;)Lo23/d;",
        "updatePollOption",
        "optionId",
        "deletePollOption",
        "Lio/getstream/chat/android/models/Vote;",
        "Lio/getstream/chat/android/models/QueryPollVotesResult;",
        "queryPollVotes",
        "Lio/getstream/chat/android/models/QueryPollsResult;",
        "queryPolls",
        "castPollVote",
        "answer",
        "castPollAnswer",
        "voteId",
        "removePollVote",
        "partialUpdatePoll",
        "closePoll",
        "deletePoll",
        "remindAt",
        "Lio/getstream/chat/android/models/MessageReminder;",
        "createReminder",
        "updateReminder",
        "deleteReminder",
        "Lio/getstream/chat/android/models/QueryRemindersResult;",
        "queryReminders",
        "(Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;",
        "Lio/getstream/chat/android/models/Location;",
        "queryActiveLocations",
        "location",
        "updateLiveLocation",
        "(Lio/getstream/chat/android/models/Location;)Lo23/d;",
        "stopLiveLocation",
        "warmUp",
        "()V",
        "releaseConnection",
        "Lio/getstream/chat/android/client/api/ChatApi;",
        "Lbc3/c0;",
        "Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final delegate:Lio/getstream/chat/android/client/api/ChatApi;

.field private final scope:Lbc3/c0;

.field private final sendMessageInterceptor:Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/api/ChatApi;Lbc3/c0;Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    iput-object p2, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->scope:Lbc3/c0;

    iput-object p3, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->sendMessageInterceptor:Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;

    return-void
.end method


# virtual methods
.method public final acceptInvite(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->acceptInvite(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final addDevice(Lio/getstream/chat/android/models/Device;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Device;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->addDevice(Lio/getstream/chat/android/models/Device;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final addMembers(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/Boolean;)Lo23/d;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/MemberData;",
            ">;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/Boolean;",
            "Ljava/util/Date;",
            "Ljava/lang/Boolean;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "members"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-interface/range {v1 .. v8}, Lio/getstream/chat/android/client/api/ChatApi;->addMembers(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/Boolean;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final appSettings()Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0}, Lio/getstream/chat/android/client/api/ChatApi;->appSettings()Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final banUser(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "targetId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    invoke-interface/range {v1 .. v7}, Lio/getstream/chat/android/client/api/ChatApi;->banUser(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final blockUser(Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->blockUser(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final castPollAnswer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "answer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->castPollAnswer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final castPollVote(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->castPollVote(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final closePoll(Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "pollId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->closePoll(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final createDraftMessage(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/DraftMessage;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->createDraftMessage(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final createPoll(Lio/getstream/chat/android/models/CreatePollParams;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/CreatePollParams;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "createPollParams"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->createPoll(Lio/getstream/chat/android/models/CreatePollParams;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final createPollOption(Ljava/lang/String;Lio/getstream/chat/android/models/PollOption;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/PollOption;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "pollId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "option"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->createPollOption(Ljava/lang/String;Lio/getstream/chat/android/models/PollOption;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final createReminder(Ljava/lang/String;Ljava/util/Date;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->createReminder(Ljava/lang/String;Ljava/util/Date;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final deleteChannel(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->deleteChannel(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final deleteDevice(Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->deleteDevice(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final deleteDraftMessage(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/DraftMessage;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->deleteDraftMessage(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final deleteFile(Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    .line 1
    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->deleteFile(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final deleteFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    .line 2
    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->deleteFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final deleteImage(Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    .line 1
    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->deleteImage(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final deleteImage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    .line 2
    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->deleteImage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final deleteMessage(Ljava/lang/String;ZZ)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZ)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->deleteMessage(Ljava/lang/String;ZZ)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final deletePoll(Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "pollId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->deletePoll(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final deletePollOption(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "pollId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->deletePollOption(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final deleteReaction(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->deleteReaction(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final deleteReminder(Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->deleteReminder(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final disableSlowMode(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->disableSlowMode(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final downloadFile(Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "fileUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->downloadFile(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final enableSlowMode(Ljava/lang/String;Ljava/lang/String;I)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->enableSlowMode(Ljava/lang/String;Ljava/lang/String;I)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final flagMessage(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->flagMessage(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final flagUser(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->flagUser(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final getDevices()Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0}, Lio/getstream/chat/android/client/api/ChatApi;->getDevices()Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final getGuestUser(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->getGuestUser(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final getMessage(Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->getMessage(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final getNewerReplies(Ljava/lang/String;ILjava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "parentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->getNewerReplies(Ljava/lang/String;ILjava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final getPendingMessage(Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->getPendingMessage(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final getPinnedMessages(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)Lo23/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sort"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pagination"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-interface/range {v1 .. v6}, Lio/getstream/chat/android/client/api/ChatApi;->getPinnedMessages(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final getPoll(Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "pollId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->getPoll(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final getReactions(Ljava/lang/String;II)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->getReactions(Ljava/lang/String;II)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final getReplies(Ljava/lang/String;I)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->getReplies(Ljava/lang/String;I)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final getRepliesMore(Ljava/lang/String;Ljava/lang/String;I)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firstId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->getRepliesMore(Ljava/lang/String;Ljava/lang/String;I)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final getSyncHistory(Ljava/util/List;Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastSyncAt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->getSyncHistory(Ljava/util/List;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final getThread(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/GetThreadOptions;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api/models/GetThreadOptions;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->getThread(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/GetThreadOptions;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final getUnreadCounts()Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0}, Lio/getstream/chat/android/client/api/ChatApi;->getUnreadCounts()Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final hideChannel(Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->hideChannel(Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final inviteMembers(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;)Lo23/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/Boolean;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "members"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-interface/range {v1 .. v6}, Lio/getstream/chat/android/client/api/ChatApi;->inviteMembers(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final markAllRead()Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0}, Lio/getstream/chat/android/client/api/ChatApi;->markAllRead()Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final markDelivered(Ljava/util/List;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->markDelivered(Ljava/util/List;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final markRead(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->markRead(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final markThreadRead(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->markThreadRead(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final markUnread(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lo23/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-interface/range {v1 .. v6}, Lio/getstream/chat/android/client/api/ChatApi;->markUnread(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final muteChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->muteChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final muteCurrentUser()Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0}, Lio/getstream/chat/android/client/api/ChatApi;->muteCurrentUser()Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final muteUser(Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->muteUser(Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final og(Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->og(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final partialUpdateMember(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "set"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unset"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-interface/range {v1 .. v6}, Lio/getstream/chat/android/client/api/ChatApi;->partialUpdateMember(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final partialUpdateMessage(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Z)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "set"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unset"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/api/ChatApi;->partialUpdateMessage(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Z)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final partialUpdatePoll(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "pollId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "set"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unset"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->partialUpdatePoll(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final partialUpdateThread(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "set"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unset"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->partialUpdateThread(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final partialUpdateUser(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "set"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unset"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->partialUpdateUser(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final queryActiveLocations()Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0}, Lio/getstream/chat/android/client/api/ChatApi;->queryActiveLocations()Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final queryBannedUsers(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lo23/d;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/BannedUsersSort;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-interface/range {v1 .. v9}, Lio/getstream/chat/android/client/api/ChatApi;->queryBannedUsers(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final queryBlockedUsers()Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0}, Lio/getstream/chat/android/client/api/ChatApi;->queryBlockedUsers()Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final queryChannel(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "query"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->queryChannel(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final queryChannels(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->queryChannels(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final queryDraftMessages(Ljava/lang/Integer;Ljava/lang/Integer;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->queryDraftMessages(Ljava/lang/Integer;Ljava/lang/Integer;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final queryDrafts(Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/DraftsSort;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sort"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/api/ChatApi;->queryDrafts(Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final queryMembers(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/d;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Member;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sort"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "members"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-interface/range {v1 .. v8}, Lio/getstream/chat/android/client/api/ChatApi;->queryMembers(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final queryPollVotes(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Vote;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "pollId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-interface/range {v1 .. v6}, Lio/getstream/chat/android/client/api/ChatApi;->queryPollVotes(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final queryPolls(Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Poll;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/api/ChatApi;->queryPolls(Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final queryReactions(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-interface/range {v1 .. v6}, Lio/getstream/chat/android/client/api/ChatApi;->queryReactions(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final queryReminders(Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "I",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/MessageReminder;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sort"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/api/ChatApi;->queryReminders(Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final queryThreads(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->queryThreads(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final queryUsers(Lio/getstream/chat/android/client/api/models/QueryUsersRequest;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryUsersRequest;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "queryUsers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->queryUsers(Lio/getstream/chat/android/client/api/models/QueryUsersRequest;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final rejectInvite(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->rejectInvite(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final releaseConnection()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0}, Lio/getstream/chat/android/client/api/ChatApi;->releaseConnection()V

    return-void
.end method

.method public final removeMembers(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;)Lo23/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/lang/Boolean;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "members"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-interface/range {v1 .. v6}, Lio/getstream/chat/android/client/api/ChatApi;->removeMembers(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final removePollVote(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "voteId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->removePollVote(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final searchMessages(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageFilter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-interface/range {v1 .. v7}, Lio/getstream/chat/android/client/api/ChatApi;->searchMessages(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final sendAction(Lio/getstream/chat/android/client/api/models/SendActionRequest;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/SendActionRequest;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->sendAction(Lio/getstream/chat/android/client/api/models/SendActionRequest;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final sendEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "eventType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/api/ChatApi;->sendEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final sendFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Lio/getstream/chat/android/client/utils/ProgressCallback;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "file"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/api/ChatApi;->sendFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final sendImage(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Lio/getstream/chat/android/client/utils/ProgressCallback;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "file"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/api/ChatApi;->sendImage(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final sendMessage(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->sendMessageInterceptor:Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;

    if-eqz v2, :cond_0

    new-instance v0, Lo23/h;

    iget-object v7, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/client/api/ProxyChatApi$sendMessage$1$1;

    const/4 v6, 0x0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/api/ProxyChatApi$sendMessage$1$1;-><init>(Lio/getstream/chat/android/client/interceptor/SendMessageInterceptor;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)V

    invoke-direct {v0, v7, v1}, Lo23/h;-><init>(Lbc3/c0;Lc93/m;)V

    return-object v0

    :cond_0
    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    iget-object p1, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {p1, v3, v4, v5}, Lio/getstream/chat/android/client/api/ChatApi;->sendMessage(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final sendReaction(Lio/getstream/chat/android/models/Reaction;ZZ)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Reaction;",
            "ZZ)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "reaction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->sendReaction(Lio/getstream/chat/android/models/Reaction;ZZ)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final setChannelPushPreference(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/PushPreferenceLevel;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "level"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->setChannelPushPreference(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final setConnection(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->setConnection(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final setUserPushPreference(Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/PushPreferenceLevel;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "level"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->setUserPushPreference(Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final showChannel(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->showChannel(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final snoozeChannelPushNotifications(Ljava/lang/String;Ljava/util/Date;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "until"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->snoozeChannelPushNotifications(Ljava/lang/String;Ljava/util/Date;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final snoozeUserPushNotifications(Ljava/util/Date;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "until"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->snoozeUserPushNotifications(Ljava/util/Date;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final stopLiveLocation(Lio/getstream/chat/android/models/Location;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Location;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->stopLiveLocation(Lio/getstream/chat/android/models/Location;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final stopWatching(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->stopWatching(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final translate(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "language"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->translate(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final truncateChannel(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->truncateChannel(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final unbanUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "targetId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/api/ChatApi;->unbanUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final unblockUser(Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->unblockUser(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final unflagMessage(Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->unflagMessage(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final unflagUser(Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->unflagUser(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final unmuteChannel(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->unmuteChannel(Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final unmuteCurrentUser()Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0}, Lio/getstream/chat/android/client/api/ChatApi;->unmuteCurrentUser()Lo23/d;

    move-result-object v0

    return-object v0
.end method

.method public final unmuteUser(Ljava/lang/String;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "userId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->unmuteUser(Ljava/lang/String;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final updateChannel(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/Message;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lio/getstream/chat/android/models/Message;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/api/ChatApi;->updateChannel(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/Message;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final updateChannelPartial(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "set"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unset"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/api/ChatApi;->updateChannelPartial(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final updateLiveLocation(Lio/getstream/chat/android/models/Location;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Location;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->updateLiveLocation(Lio/getstream/chat/android/models/Location;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final updateMessage(Lio/getstream/chat/android/models/Message;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->updateMessage(Lio/getstream/chat/android/models/Message;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final updatePoll(Lio/getstream/chat/android/client/api/models/UpdatePollRequest;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/UpdatePollRequest;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->updatePoll(Lio/getstream/chat/android/client/api/models/UpdatePollRequest;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final updatePollOption(Ljava/lang/String;Lio/getstream/chat/android/models/PollOption;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/PollOption;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "pollId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "option"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->updatePollOption(Ljava/lang/String;Lio/getstream/chat/android/models/PollOption;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final updateReminder(Ljava/lang/String;Ljava/util/Date;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->updateReminder(Ljava/lang/String;Ljava/util/Date;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final updateUsers(Ljava/util/List;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "users"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/ChatApi;->updateUsers(Ljava/util/List;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final uploadFile(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lio/getstream/chat/android/client/utils/ProgressCallback;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->uploadFile(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final uploadImage(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lio/getstream/chat/android/client/utils/ProgressCallback;",
            ")",
            "Lo23/d;"
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/ChatApi;->uploadImage(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;

    move-result-object p1

    return-object p1
.end method

.method public final warmUp()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ProxyChatApi;->delegate:Lio/getstream/chat/android/client/api/ChatApi;

    invoke-interface {v0}, Lio/getstream/chat/android/client/api/ChatApi;->warmUp()V

    return-void
.end method
