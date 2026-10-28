.class public interface abstract Lio/getstream/chat/android/client/api/ChatApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b8\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010$\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H&\u00a2\u0006\u0004\u0008\n\u0010\u000bJ9\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\'\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J9\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\'\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J-\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J-\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\'\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00082\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\'\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001d\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0006\u0010\u0016\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\u0017\u0010\u001dJ\'\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00082\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\'\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ\u001d\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0006\u0010\u0016\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\u0019\u0010\u001dJ\u001d\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0006\u0010 \u001a\u00020\u001fH\'\u00a2\u0006\u0004\u0008!\u0010\"J\u001d\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0006\u0010#\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008$\u0010\u001dJ\u001b\u0010&\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001f0%0\u0008H\'\u00a2\u0006\u0004\u0008&\u0010\u000bJ\u001d\u0010*\u001a\u0008\u0012\u0004\u0012\u00020)0\u00082\u0006\u0010(\u001a\u00020\'H\'\u00a2\u0006\u0004\u0008*\u0010+J\u001d\u0010.\u001a\u0008\u0012\u0004\u0012\u00020)0\u00082\u0006\u0010-\u001a\u00020,H\'\u00a2\u0006\u0004\u0008.\u0010/J%\u00101\u001a\u0008\u0012\u0004\u0012\u00020)0\u00082\u0006\u00100\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\'H\'\u00a2\u0006\u0004\u00081\u00102J%\u00103\u001a\u0008\u0012\u0004\u0012\u00020)0\u00082\u0006\u00100\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H\'\u00a2\u0006\u0004\u00083\u00104JS\u0010@\u001a\u0008\u0012\u0004\u0012\u00020?0\u00082\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u0002052\u0008\u00109\u001a\u0004\u0018\u0001082\u0008\u0010:\u001a\u0004\u0018\u0001082\u0008\u0010;\u001a\u0004\u0018\u00010\u00022\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010<H\'\u00a2\u0006\u0004\u0008@\u0010AJ3\u0010D\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020=0%0\u00082\u0006\u0010B\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u00022\u0006\u0010:\u001a\u000208H\'\u00a2\u0006\u0004\u0008D\u0010EJ+\u0010F\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020=0%0\u00082\u0006\u0010B\u001a\u00020\u00022\u0006\u0010:\u001a\u000208H\'\u00a2\u0006\u0004\u0008F\u0010GJ5\u0010J\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020=0%0\u00082\u0006\u0010H\u001a\u00020\u00022\u0006\u0010:\u001a\u0002082\u0008\u0010I\u001a\u0004\u0018\u00010\u0002H\'\u00a2\u0006\u0004\u0008J\u0010KJ3\u0010M\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020L0%0\u00082\u0006\u0010B\u001a\u00020\u00022\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u000208H\'\u00a2\u0006\u0004\u0008M\u0010NJK\u0010Q\u001a\u0008\u0012\u0004\u0012\u00020P0\u00082\u0006\u0010B\u001a\u00020\u00022\u0008\u0010O\u001a\u0004\u0018\u0001052\u0008\u0010:\u001a\u0004\u0018\u0001082\u0008\u0010;\u001a\u0004\u0018\u00010\u00022\u000e\u0010>\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010<H\'\u00a2\u0006\u0004\u0008Q\u0010RJ-\u0010W\u001a\u0008\u0012\u0004\u0012\u00020L0\u00082\u0006\u0010S\u001a\u00020L2\u0006\u0010U\u001a\u00020T2\u0006\u0010V\u001a\u00020TH\'\u00a2\u0006\u0004\u0008W\u0010XJ%\u0010Z\u001a\u0008\u0012\u0004\u0012\u00020=0\u00082\u0006\u0010B\u001a\u00020\u00022\u0006\u0010Y\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008Z\u0010[J-\u0010^\u001a\u0008\u0012\u0004\u0012\u00020=0\u00082\u0006\u0010B\u001a\u00020\u00022\u0006\u0010\\\u001a\u00020T2\u0006\u0010]\u001a\u00020TH\'\u00a2\u0006\u0004\u0008^\u0010_J\u001d\u0010b\u001a\u0008\u0012\u0004\u0012\u00020=0\u00082\u0006\u0010a\u001a\u00020`H\'\u00a2\u0006\u0004\u0008b\u0010cJ\u001d\u0010d\u001a\u0008\u0012\u0004\u0012\u00020=0\u00082\u0006\u0010B\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008d\u0010\u001dJ\u001d\u0010f\u001a\u0008\u0012\u0004\u0012\u00020e0\u00082\u0006\u0010B\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008f\u0010\u001dJ-\u0010h\u001a\u0008\u0012\u0004\u0012\u00020=0\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010g\u001a\u00020=H\'\u00a2\u0006\u0004\u0008h\u0010iJ-\u0010k\u001a\u0008\u0012\u0004\u0012\u00020j0\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010g\u001a\u00020jH\'\u00a2\u0006\u0004\u0008k\u0010lJ-\u0010m\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010g\u001a\u00020jH\'\u00a2\u0006\u0004\u0008m\u0010lJ/\u0010n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020j0%0\u00082\u0008\u00109\u001a\u0004\u0018\u0001082\u0008\u0010:\u001a\u0004\u0018\u000108H\'\u00a2\u0006\u0004\u0008n\u0010oJ?\u0010r\u001a\u0008\u0012\u0004\u0012\u00020q0\u00082\u0006\u0010O\u001a\u0002052\u0008\u0010:\u001a\u0004\u0018\u0001082\u0008\u0010;\u001a\u0004\u0018\u00010\u00022\u000c\u0010>\u001a\u0008\u0012\u0004\u0012\u00020p0<H\'\u00a2\u0006\u0004\u0008r\u0010sJ/\u0010u\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0008\u0010t\u001a\u0004\u0018\u000108H\'\u00a2\u0006\u0004\u0008u\u0010vJ%\u0010w\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008w\u0010[J\u001d\u0010x\u001a\u0008\u0012\u0004\u0012\u00020=0\u00082\u0006\u0010g\u001a\u00020=H\'\u00a2\u0006\u0004\u0008x\u0010yJI\u0010~\u001a\u0008\u0012\u0004\u0012\u00020=0\u00082\u0006\u0010B\u001a\u00020\u00022\u0012\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010z2\u000c\u0010|\u001a\u0008\u0012\u0004\u0012\u00020\u00020%2\u0008\u0008\u0002\u0010}\u001a\u00020TH\'\u00a2\u0006\u0004\u0008~\u0010\u007fJ\'\u0010\u0080\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u0080\u0001\u0010[JN\u0010\u0083\u0001\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020=0%0\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010:\u001a\u0002082\u000c\u0010>\u001a\u0008\u0012\u0004\u0012\u00020=0<2\u0008\u0010\u0082\u0001\u001a\u00030\u0081\u0001H\'\u00a2\u0006\u0006\u0008\u0083\u0001\u0010\u0084\u0001J#\u0010\u0088\u0001\u001a\t\u0012\u0005\u0012\u00030\u0087\u00010\u00082\u0008\u0010\u0086\u0001\u001a\u00030\u0085\u0001H\'\u00a2\u0006\u0006\u0008\u0088\u0001\u0010\u0089\u0001J/\u0010\u008c\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008a\u00010%0\u00082\u000e\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u008a\u00010%H\'\u00a2\u0006\u0006\u0008\u008c\u0001\u0010\u008d\u0001J \u0010\u008f\u0001\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010\u00082\u0006\u0010\u0003\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u008f\u0001\u0010\u001dJ\u001f\u0010\u0090\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0006\u0010\u0003\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u0090\u0001\u0010\u001dJ\u001e\u0010\u0091\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008e\u00010%0\u0008H\'\u00a2\u0006\u0005\u0008\u0091\u0001\u0010\u000bJI\u0010\u0092\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008a\u00010%0\u00082\u0006\u0010#\u001a\u00020\u00022\u0012\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010z2\u000c\u0010|\u001a\u0008\u0012\u0004\u0012\u00020\u00020%H\'\u00a2\u0006\u0006\u0008\u0092\u0001\u0010\u0093\u0001J5\u0010\u0096\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0002\u0010\r\u001a\u00020\u00022\u0008\u0010\u0086\u0001\u001a\u00030\u0094\u0001H&\u00a2\u0006\u0006\u0008\u0096\u0001\u0010\u0097\u0001JH\u0010\u0099\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0013\u0010\u0098\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010z2\u0008\u0010x\u001a\u0004\u0018\u00010=H\'\u00a2\u0006\u0006\u0008\u0099\u0001\u0010\u009a\u0001JK\u0010\u009b\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0012\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010z2\u000c\u0010|\u001a\u0008\u0012\u0004\u0012\u00020\u00020%H\'\u00a2\u0006\u0006\u0008\u009b\u0001\u0010\u009c\u0001J1\u0010\u009e\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010\u009d\u0001\u001a\u000208H\'\u00a2\u0006\u0005\u0008\u009e\u0001\u0010EJ(\u0010\u009f\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u009f\u0001\u0010[J\u0018\u0010\u00a1\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a0\u00010\u0008H&\u00a2\u0006\u0005\u0008\u00a1\u0001\u0010\u000bJ1\u0010\u00a2\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0008\u0008\u0002\u0010B\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u00a2\u0001\u0010\u0018J\'\u0010\u00a4\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\r\u0010\u00a3\u0001\u001a\u0008\u0012\u0004\u0012\u00020=0%H\'\u00a2\u0006\u0006\u0008\u00a4\u0001\u0010\u008d\u0001J0\u0010\u00a6\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010\u00a5\u0001\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u00a6\u0001\u0010\u0018JN\u0010\u00a8\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\n\u0008\u0002\u0010B\u001a\u0004\u0018\u00010\u00022\u000b\u0008\u0002\u0010\u00a7\u0001\u001a\u0004\u0018\u00010,2\u000b\u0008\u0002\u0010\u00a5\u0001\u001a\u0004\u0018\u00010\u0002H\'\u00a2\u0006\u0006\u0008\u00a8\u0001\u0010\u00a9\u0001J\'\u0010\u00aa\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u00aa\u0001\u0010[J1\u0010\u00ac\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010\u00ab\u0001\u001a\u00020TH\'\u00a2\u0006\u0006\u0008\u00ac\u0001\u0010\u00ad\u0001J3\u0010\u00af\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\t\u0010\u00ae\u0001\u001a\u0004\u0018\u00010=H\'\u00a2\u0006\u0005\u0008\u00af\u0001\u0010iJ(\u0010\u00b0\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u00b0\u0001\u0010[J\u0018\u0010\u00b2\u0001\u001a\t\u0012\u0005\u0012\u00030\u00b1\u00010\u0008H\'\u00a2\u0006\u0005\u0008\u00b2\u0001\u0010\u000bJ\u0017\u0010\u00b3\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0008H\'\u00a2\u0006\u0005\u0008\u00b3\u0001\u0010\u000bJ2\u0010\u00b4\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0008\u0010g\u001a\u0004\u0018\u00010\u0002H\'\u00a2\u0006\u0005\u0008\u00b4\u0001\u0010\u0018J(\u0010\u00b5\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u00b5\u0001\u0010[J\u0017\u0010\u00b6\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0008H\'\u00a2\u0006\u0005\u0008\u00b6\u0001\u0010\u000bJ)\u0010\u00b9\u0001\u001a\t\u0012\u0005\u0012\u00030\u00b8\u00010\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010\u00b7\u0001\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u00b9\u0001\u0010[J)\u0010\u00bb\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008a\u00010%0\u00082\u0008\u0010\u00bb\u0001\u001a\u00030\u00ba\u0001H\'\u00a2\u0006\u0006\u0008\u00bb\u0001\u0010\u00bc\u0001Jd\u0010\u00c1\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u000e\u0010\u00be\u0001\u001a\t\u0012\u0005\u0012\u00030\u00bd\u00010%2\t\u0010\u00ae\u0001\u001a\u0004\u0018\u00010=2\t\u0010\u00bf\u0001\u001a\u0004\u0018\u00010T2\t\u0010\u00c0\u0001\u001a\u0004\u0018\u00010,2\u0008\u0010V\u001a\u0004\u0018\u00010TH\'\u00a2\u0006\u0006\u0008\u00c1\u0001\u0010\u00c2\u0001JM\u0010\u00c3\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\r\u0010\u00be\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00020%2\t\u0010\u00ae\u0001\u001a\u0004\u0018\u00010=2\u0008\u0010V\u001a\u0004\u0018\u00010TH\'\u00a2\u0006\u0006\u0008\u00c3\u0001\u0010\u00c4\u0001JM\u0010\u00c5\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\r\u0010\u00be\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00020%2\t\u0010\u00ae\u0001\u001a\u0004\u0018\u00010=2\u0008\u0010V\u001a\u0004\u0018\u00010TH\'\u00a2\u0006\u0006\u0008\u00c5\u0001\u0010\u00c4\u0001JS\u0010\u00c7\u0001\u001a\t\u0012\u0005\u0012\u00030\u00c6\u00010\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010z2\u000c\u0010|\u001a\u0008\u0012\u0004\u0012\u00020\u00020%H\'\u00a2\u0006\u0006\u0008\u00c7\u0001\u0010\u00c8\u0001Jf\u0010\u00c9\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00c6\u00010%0\u00082\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u0002082\u0006\u0010O\u001a\u0002052\r\u0010>\u001a\t\u0012\u0005\u0012\u00030\u00c6\u00010<2\u000e\u0010\u00be\u0001\u001a\t\u0012\u0005\u0012\u00030\u00c6\u00010%H\'\u00a2\u0006\u0006\u0008\u00c9\u0001\u0010\u00ca\u0001J,\u0010\u00cc\u0001\u001a\t\u0012\u0005\u0012\u00030\u00b1\u00010\u00082\u0006\u0010\u0003\u001a\u00020\u00022\t\u0010\u00cb\u0001\u001a\u0004\u0018\u000108H\'\u00a2\u0006\u0006\u0008\u00cc\u0001\u0010\u00cd\u0001J\u001f\u0010\u00ce\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0006\u0010\u0003\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u00ce\u0001\u0010\u001dJA\u0010\u00d2\u0001\u001a\t\u0012\u0005\u0012\u00030\u00d1\u00010\u00082\u0006\u0010\u0003\u001a\u00020\u00022\t\u0010\u00cf\u0001\u001a\u0004\u0018\u00010\u00022\u0013\u0010\u00d0\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020zH\'\u00a2\u0006\u0006\u0008\u00d2\u0001\u0010\u00d3\u0001J \u0010\u00d4\u0001\u001a\t\u0012\u0005\u0012\u00030\u00d1\u00010\u00082\u0006\u0010\u0003\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u00d4\u0001\u0010\u001dJA\u0010\u00d5\u0001\u001a\t\u0012\u0005\u0012\u00030\u00d1\u00010\u00082\u0006\u0010B\u001a\u00020\u00022\t\u0010\u00cf\u0001\u001a\u0004\u0018\u00010\u00022\u0013\u0010\u00d0\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020zH\'\u00a2\u0006\u0006\u0008\u00d5\u0001\u0010\u00d3\u0001J \u0010\u00d6\u0001\u001a\t\u0012\u0005\u0012\u00030\u00d1\u00010\u00082\u0006\u0010B\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u00d6\u0001\u0010\u001dJP\u0010\u00d9\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0007\u0010\u00d7\u0001\u001a\u00020\u00022\t\u0010\u00cb\u0001\u001a\u0004\u0018\u0001082\t\u0010\u00cf\u0001\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010\u00d8\u0001\u001a\u00020TH\'\u00a2\u0006\u0006\u0008\u00d9\u0001\u0010\u00da\u0001J:\u0010\u00db\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0007\u0010\u00d7\u0001\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0007\u0010\u00d8\u0001\u001a\u00020TH\'\u00a2\u0006\u0006\u0008\u00db\u0001\u0010\u00dc\u0001Jv\u0010\u00e3\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00e2\u00010%0\u00082\u0006\u0010O\u001a\u0002052\r\u0010>\u001a\t\u0012\u0005\u0012\u00030\u00dd\u00010<2\u0008\u00109\u001a\u0004\u0018\u0001082\u0008\u0010:\u001a\u0004\u0018\u0001082\t\u0010\u00de\u0001\u001a\u0004\u0018\u00010,2\t\u0010\u00df\u0001\u001a\u0004\u0018\u00010,2\t\u0010\u00e0\u0001\u001a\u0004\u0018\u00010,2\t\u0010\u00e1\u0001\u001a\u0004\u0018\u00010,H\'\u00a2\u0006\u0006\u0008\u00e3\u0001\u0010\u00e4\u0001JG\u0010\u00e7\u0001\u001a\t\u0012\u0005\u0012\u00030\u00e6\u00010\u00082\u0007\u0010\u00e5\u0001\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0013\u0010\u0098\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010zH\'\u00a2\u0006\u0006\u0008\u00e7\u0001\u0010\u00e8\u0001J(\u0010\u00ea\u0001\u001a\u0008\u0012\u0004\u0012\u00020=0\u00082\u0006\u0010B\u001a\u00020\u00022\u0007\u0010\u00e9\u0001\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u00ea\u0001\u0010[J \u0010\u00ec\u0001\u001a\t\u0012\u0005\u0012\u00030\u00eb\u00010\u00082\u0006\u0010\u0016\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u00ec\u0001\u0010\u001dJ7\u0010\u00ef\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00e6\u00010%0\u00082\r\u0010\u00ed\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00020%2\u0007\u0010\u00ee\u0001\u001a\u00020\u0002H\'\u00a2\u0006\u0006\u0008\u00ef\u0001\u0010\u00f0\u0001J!\u0010\u00f3\u0001\u001a\t\u0012\u0005\u0012\u00030\u00f2\u00010\u00082\u0007\u0010\u00f1\u0001\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u00f3\u0001\u0010\u001dJ#\u0010\u00f6\u0001\u001a\t\u0012\u0005\u0012\u00030\u00f5\u00010\u00082\u0008\u0010\u0086\u0001\u001a\u00030\u00f4\u0001H\'\u00a2\u0006\u0006\u0008\u00f6\u0001\u0010\u00f7\u0001J+\u0010\u00fb\u0001\u001a\t\u0012\u0005\u0012\u00030\u00fa\u00010\u00082\u0006\u0010B\u001a\u00020\u00022\u0008\u0010\u00f9\u0001\u001a\u00030\u00f8\u0001H\'\u00a2\u0006\u0006\u0008\u00fb\u0001\u0010\u00fc\u0001JC\u0010\u00fe\u0001\u001a\t\u0012\u0005\u0012\u00030\u00fd\u00010\u00082\u0006\u0010B\u001a\u00020\u00022\u0012\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010z2\u000c\u0010|\u001a\u0008\u0012\u0004\u0012\u00020\u00020%H\'\u00a2\u0006\u0006\u0008\u00fe\u0001\u0010\u0093\u0001J#\u0010\u0082\u0002\u001a\t\u0012\u0005\u0012\u00030\u0081\u00020\u00082\u0008\u0010\u0080\u0002\u001a\u00030\u00ff\u0001H\'\u00a2\u0006\u0006\u0008\u0082\u0002\u0010\u0083\u0002J\"\u0010\u0085\u0002\u001a\t\u0012\u0005\u0012\u00030\u0081\u00020\u00082\u0007\u0010a\u001a\u00030\u0084\u0002H\'\u00a2\u0006\u0006\u0008\u0085\u0002\u0010\u0086\u0002J!\u0010\u0088\u0002\u001a\t\u0012\u0005\u0012\u00030\u0081\u00020\u00082\u0007\u0010\u0087\u0002\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u0088\u0002\u0010\u001dJ,\u0010\u008b\u0002\u001a\t\u0012\u0005\u0012\u00030\u0089\u00020\u00082\u0007\u0010\u0087\u0002\u001a\u00020\u00022\u0008\u0010\u008a\u0002\u001a\u00030\u0089\u0002H\'\u00a2\u0006\u0006\u0008\u008b\u0002\u0010\u008c\u0002J,\u0010\u008d\u0002\u001a\t\u0012\u0005\u0012\u00030\u0089\u00020\u00082\u0007\u0010\u0087\u0002\u001a\u00020\u00022\u0008\u0010\u008a\u0002\u001a\u00030\u0089\u0002H\'\u00a2\u0006\u0006\u0008\u008d\u0002\u0010\u008c\u0002J)\u0010\u008f\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0007\u0010\u0087\u0002\u001a\u00020\u00022\u0007\u0010\u008e\u0002\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u008f\u0002\u0010[JP\u0010\u0092\u0002\u001a\t\u0012\u0005\u0012\u00030\u0091\u00020\u00082\u0007\u0010\u0087\u0002\u001a\u00020\u00022\u0008\u0010O\u001a\u0004\u0018\u0001052\u0008\u0010:\u001a\u0004\u0018\u0001082\u0008\u0010;\u001a\u0004\u0018\u00010\u00022\u000f\u0010>\u001a\u000b\u0012\u0005\u0012\u00030\u0090\u0002\u0018\u00010<H\'\u00a2\u0006\u0005\u0008\u0092\u0002\u0010RJG\u0010\u0094\u0002\u001a\t\u0012\u0005\u0012\u00030\u0093\u00020\u00082\u0008\u0010O\u001a\u0004\u0018\u0001052\u0008\u0010:\u001a\u0004\u0018\u0001082\u0008\u0010;\u001a\u0004\u0018\u00010\u00022\u000f\u0010>\u001a\u000b\u0012\u0005\u0012\u00030\u0081\u0002\u0018\u00010<H\'\u00a2\u0006\u0005\u0008\u0094\u0002\u0010sJ2\u0010\u0095\u0002\u001a\t\u0012\u0005\u0012\u00030\u0090\u00020\u00082\u0006\u0010B\u001a\u00020\u00022\u0007\u0010\u0087\u0002\u001a\u00020\u00022\u0007\u0010\u008e\u0002\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u0095\u0002\u0010\u0018J2\u0010\u0097\u0002\u001a\t\u0012\u0005\u0012\u00030\u0090\u00020\u00082\u0006\u0010B\u001a\u00020\u00022\u0007\u0010\u0087\u0002\u001a\u00020\u00022\u0007\u0010\u0096\u0002\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u0097\u0002\u0010\u0018J2\u0010\u0099\u0002\u001a\t\u0012\u0005\u0012\u00030\u0090\u00020\u00082\u0006\u0010B\u001a\u00020\u00022\u0007\u0010\u0087\u0002\u001a\u00020\u00022\u0007\u0010\u0098\u0002\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u0099\u0002\u0010\u0018JD\u0010\u009a\u0002\u001a\t\u0012\u0005\u0012\u00030\u0081\u00020\u00082\u0007\u0010\u0087\u0002\u001a\u00020\u00022\u0012\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010z2\u000c\u0010|\u001a\u0008\u0012\u0004\u0012\u00020\u00020%H\'\u00a2\u0006\u0006\u0008\u009a\u0002\u0010\u0093\u0001J!\u0010\u009b\u0002\u001a\t\u0012\u0005\u0012\u00030\u0081\u00020\u00082\u0007\u0010\u0087\u0002\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u009b\u0002\u0010\u001dJ \u0010\u009c\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0007\u0010\u0087\u0002\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u009c\u0002\u0010\u001dJ+\u0010\u009f\u0002\u001a\t\u0012\u0005\u0012\u00030\u009e\u00020\u00082\u0006\u0010B\u001a\u00020\u00022\t\u0010\u009d\u0002\u001a\u0004\u0018\u00010,H\'\u00a2\u0006\u0005\u0008\u009f\u0002\u00104J+\u0010\u00a0\u0002\u001a\t\u0012\u0005\u0012\u00030\u009e\u00020\u00082\u0006\u0010B\u001a\u00020\u00022\t\u0010\u009d\u0002\u001a\u0004\u0018\u00010,H\'\u00a2\u0006\u0005\u0008\u00a0\u0002\u00104J\u001f\u0010\u00a1\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00082\u0006\u0010B\u001a\u00020\u0002H\'\u00a2\u0006\u0005\u0008\u00a1\u0002\u0010\u001dJB\u0010\u00a3\u0002\u001a\t\u0012\u0005\u0012\u00030\u00a2\u00020\u00082\u0006\u0010O\u001a\u0002052\u0006\u0010:\u001a\u0002082\u0008\u0010;\u001a\u0004\u0018\u00010\u00022\r\u0010>\u001a\t\u0012\u0005\u0012\u00030\u009e\u00020<H\'\u00a2\u0006\u0006\u0008\u00a3\u0002\u0010\u00a4\u0002J\u001e\u0010\u00a6\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00a5\u00020%0\u0008H\'\u00a2\u0006\u0005\u0008\u00a6\u0002\u0010\u000bJ#\u0010\u00a8\u0002\u001a\t\u0012\u0005\u0012\u00030\u00a5\u00020\u00082\u0008\u0010\u00a7\u0002\u001a\u00030\u00a5\u0002H\'\u00a2\u0006\u0006\u0008\u00a8\u0002\u0010\u00a9\u0002J#\u0010\u00aa\u0002\u001a\t\u0012\u0005\u0012\u00030\u00a5\u00020\u00082\u0008\u0010\u00a7\u0002\u001a\u00030\u00a5\u0002H\'\u00a2\u0006\u0006\u0008\u00aa\u0002\u0010\u00a9\u0002J\u0012\u0010\u00ab\u0002\u001a\u00020\u0005H&\u00a2\u0006\u0006\u0008\u00ab\u0002\u0010\u00ac\u0002J\u0012\u0010\u00ad\u0002\u001a\u00020\u0005H&\u00a2\u0006\u0006\u0008\u00ad\u0002\u0010\u00ac\u0002\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u00ae\u0002\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/ChatApi;",
        "",
        "",
        "userId",
        "connectionId",
        "Ll83/a0;",
        "setConnection",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "Lo23/d;",
        "Lio/getstream/chat/android/models/AppSettings;",
        "appSettings",
        "()Lo23/d;",
        "channelType",
        "channelId",
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
        "deleteImage",
        "progressCallback",
        "uploadFile",
        "(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;",
        "(Ljava/lang/String;)Lo23/d;",
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
        "Lio/getstream/chat/android/models/Message;",
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
        "message",
        "sendMessage",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;",
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


# direct methods
.method public static synthetic markRead$default(Lio/getstream/chat/android/client/api/ChatApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lo23/d;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const-string p3, ""

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->markRead(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: markRead"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic markUnread$default(Lio/getstream/chat/android/client/api/ChatApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;ILjava/lang/Object;)Lo23/d;
    .locals 1

    if-nez p7, :cond_3

    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_2

    move-object p5, v0

    :cond_2
    invoke-interface/range {p0 .. p5}, Lio/getstream/chat/android/client/api/ChatApi;->markUnread(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lo23/d;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: markUnread"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic partialUpdateMessage$default(Lio/getstream/chat/android/client/api/ChatApi;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;ZILjava/lang/Object;)Lo23/d;
    .locals 0

    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/api/ChatApi;->partialUpdateMessage(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Z)Lo23/d;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: partialUpdateMessage"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic queryChannel$default(Lio/getstream/chat/android/client/api/ChatApi;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;ILjava/lang/Object;)Lo23/d;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const-string p2, ""

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lio/getstream/chat/android/client/api/ChatApi;->queryChannel(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)Lo23/d;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: queryChannel"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic sendFile$default(Lio/getstream/chat/android/client/api/ChatApi;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;ILjava/lang/Object;)Lo23/d;
    .locals 0

    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/api/ChatApi;->sendFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: sendFile"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic sendImage$default(Lio/getstream/chat/android/client/api/ChatApi;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;ILjava/lang/Object;)Lo23/d;
    .locals 0

    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/api/ChatApi;->sendImage(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: sendImage"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract acceptInvite(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;
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
.end method

.method public abstract addDevice(Lio/getstream/chat/android/models/Device;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Device;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract addMembers(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;Ljava/util/Date;Ljava/lang/Boolean;)Lo23/d;
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
.end method

.method public abstract appSettings()Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract banUser(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;
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
.end method

.method public abstract blockUser(Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract castPollAnswer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;
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
.end method

.method public abstract castPollVote(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;
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
.end method

.method public abstract closePoll(Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract createDraftMessage(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;)Lo23/d;
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
.end method

.method public abstract createPoll(Lio/getstream/chat/android/models/CreatePollParams;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/CreatePollParams;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract createPollOption(Ljava/lang/String;Lio/getstream/chat/android/models/PollOption;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/PollOption;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract createReminder(Ljava/lang/String;Ljava/util/Date;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract deleteChannel(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract deleteDevice(Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract deleteDraftMessage(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/DraftMessage;)Lo23/d;
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
.end method

.method public abstract deleteFile(Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract deleteFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;
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
.end method

.method public abstract deleteImage(Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract deleteImage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;
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
.end method

.method public abstract deleteMessage(Ljava/lang/String;ZZ)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZ)",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract deletePoll(Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract deletePollOption(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract deleteReaction(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract deleteReminder(Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract disableSlowMode(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract downloadFile(Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract enableSlowMode(Ljava/lang/String;Ljava/lang/String;I)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract flagMessage(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;
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
.end method

.method public abstract flagUser(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;
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
.end method

.method public abstract getDevices()Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract getGuestUser(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract getMessage(Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract getNewerReplies(Ljava/lang/String;ILjava/lang/String;)Lo23/d;
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
.end method

.method public abstract getPendingMessage(Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract getPinnedMessages(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/querysort/QuerySorter;Lio/getstream/chat/android/client/api/models/PinnedMessagesPagination;)Lo23/d;
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
.end method

.method public abstract getPoll(Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract getReactions(Ljava/lang/String;II)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II)",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract getReplies(Ljava/lang/String;I)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract getRepliesMore(Ljava/lang/String;Ljava/lang/String;I)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract getSyncHistory(Ljava/util/List;Ljava/lang/String;)Lo23/d;
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
.end method

.method public abstract getThread(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/GetThreadOptions;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api/models/GetThreadOptions;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract getUnreadCounts()Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract hideChannel(Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract inviteMembers(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;)Lo23/d;
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
.end method

.method public abstract markAllRead()Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract markDelivered(Ljava/util/List;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract markRead(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;
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
.end method

.method public abstract markThreadRead(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;
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
.end method

.method public abstract markUnread(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)Lo23/d;
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
.end method

.method public abstract muteChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;
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
.end method

.method public abstract muteCurrentUser()Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract muteUser(Ljava/lang/String;Ljava/lang/Integer;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract og(Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract partialUpdateMember(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;
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
.end method

.method public abstract partialUpdateMessage(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Z)Lo23/d;
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
.end method

.method public abstract partialUpdatePoll(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;
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
.end method

.method public abstract partialUpdateThread(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;
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
.end method

.method public abstract partialUpdateUser(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;
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
.end method

.method public abstract queryActiveLocations()Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract queryBannedUsers(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)Lo23/d;
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
.end method

.method public abstract queryBlockedUsers()Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract queryChannel(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)Lo23/d;
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
.end method

.method public abstract queryChannels(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract queryDraftMessages(Ljava/lang/Integer;Ljava/lang/Integer;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract queryDrafts(Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;
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
.end method

.method public abstract queryMembers(Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/d;
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
.end method

.method public abstract queryPollVotes(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;
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
.end method

.method public abstract queryPolls(Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;
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
.end method

.method public abstract queryReactions(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;
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
.end method

.method public abstract queryReminders(Lio/getstream/chat/android/models/FilterObject;ILjava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;
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
.end method

.method public abstract queryThreads(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract queryUsers(Lio/getstream/chat/android/client/api/models/QueryUsersRequest;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryUsersRequest;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract rejectInvite(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract releaseConnection()V
.end method

.method public abstract removeMembers(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/Message;Ljava/lang/Boolean;)Lo23/d;
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
.end method

.method public abstract removePollVote(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo23/d;
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
.end method

.method public abstract searchMessages(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/FilterObject;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lo23/d;
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
.end method

.method public abstract sendAction(Lio/getstream/chat/android/client/api/models/SendActionRequest;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/SendActionRequest;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract sendEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lo23/d;
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
.end method

.method public abstract sendFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;
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
.end method

.method public abstract sendImage(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;
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
.end method

.method public abstract sendMessage(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;
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
.end method

.method public abstract sendReaction(Lio/getstream/chat/android/models/Reaction;ZZ)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Reaction;",
            "ZZ)",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract setChannelPushPreference(Ljava/lang/String;Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/PushPreferenceLevel;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract setConnection(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract setUserPushPreference(Lio/getstream/chat/android/models/PushPreferenceLevel;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/PushPreferenceLevel;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract showChannel(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract snoozeChannelPushNotifications(Ljava/lang/String;Ljava/util/Date;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract snoozeUserPushNotifications(Ljava/util/Date;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Date;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract stopLiveLocation(Lio/getstream/chat/android/models/Location;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Location;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract stopWatching(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract translate(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract truncateChannel(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;
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
.end method

.method public abstract unbanUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lo23/d;
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
.end method

.method public abstract unblockUser(Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract unflagMessage(Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract unflagUser(Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract unmuteChannel(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract unmuteCurrentUser()Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract unmuteUser(Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract updateChannel(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/Message;)Lo23/d;
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
.end method

.method public abstract updateChannelPartial(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)Lo23/d;
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
.end method

.method public abstract updateLiveLocation(Lio/getstream/chat/android/models/Location;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Location;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract updateMessage(Lio/getstream/chat/android/models/Message;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract updatePoll(Lio/getstream/chat/android/client/api/models/UpdatePollRequest;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/UpdatePollRequest;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract updatePollOption(Ljava/lang/String;Lio/getstream/chat/android/models/PollOption;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/PollOption;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract updateReminder(Ljava/lang/String;Ljava/util/Date;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract updateUsers(Ljava/util/List;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;)",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract uploadFile(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lio/getstream/chat/android/client/utils/ProgressCallback;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract uploadImage(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lio/getstream/chat/android/client/utils/ProgressCallback;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract warmUp()V
.end method
