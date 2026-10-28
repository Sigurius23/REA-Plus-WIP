.class public final Lcom/whoop/trends/data/model/TrendsDtoV3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/trends/data/model/TrendsDtoV3$$serializer;,
        Lcom/whoop/trends/data/model/TrendsDtoV3$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008/\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008F\u0008\u0087\u0008\u0018\u0000 \u00ae\u00012\u00020\u0001:\u0004\u00af\u0001\u00ae\u0001B\u00a5\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u000f\u0012\u0008\u0010!\u001a\u0004\u0018\u00010 \u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000f\u0012\u0008\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u000f\u0012\u0008\u0010)\u001a\u0004\u0018\u00010(\u0012\u0010\u0008\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010,\u00a2\u0006\u0004\u0008.\u0010/B\u00c3\u0002\u0008\u0010\u0012\u0006\u00101\u001a\u000200\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u000f\u0012\u0008\u0010!\u001a\u0004\u0018\u00010 \u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f\u0012\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000f\u0012\u0008\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u000f\u0012\u0008\u0010)\u001a\u0004\u0018\u00010(\u0012\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u000f\u0012\u0008\u0010-\u001a\u0004\u0018\u00010,\u0012\u0008\u00103\u001a\u0004\u0018\u000102\u00a2\u0006\u0004\u0008.\u00104J\u0010\u00105\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00106J\u0010\u00107\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00087\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u00089\u0010:J\u0010\u0010;\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008;\u0010:J\u0010\u0010<\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008<\u0010:J\u0012\u0010=\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008=\u0010:J\u0010\u0010>\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008>\u00106J\u0010\u0010?\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008?\u00106J\u0012\u0010@\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008@\u0010AJ\u0016\u0010B\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008B\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008D\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u0008F\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008H\u00106J\u0012\u0010I\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0004\u0008I\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0004\u0008K\u0010JJ\u0012\u0010L\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0004\u0008L\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003\u00a2\u0006\u0004\u0008N\u0010OJ\u0016\u0010P\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008P\u0010CJ\u0012\u0010Q\u001a\u0004\u0018\u00010 H\u00c6\u0003\u00a2\u0006\u0004\u0008Q\u0010RJ\u0018\u0010S\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008S\u0010CJ\u0018\u0010T\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008T\u0010CJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008U\u00106J\u0018\u0010V\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008V\u0010CJ\u0012\u0010W\u001a\u0004\u0018\u00010(H\u00c6\u0003\u00a2\u0006\u0004\u0008W\u0010XJ\u0018\u0010Y\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008Y\u0010CJ\u0012\u0010Z\u001a\u0004\u0018\u00010,H\u00c6\u0003\u00a2\u0006\u0004\u0008Z\u0010[J\u00dc\u0002\u0010\\\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00022\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u000e\u0008\u0002\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u000f2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010 2\u0010\u0008\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f2\u0010\u0008\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000f2\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\u0010\u0008\u0002\u0010\'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u000f2\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010(2\u0010\u0008\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u000f2\n\u0008\u0002\u0010-\u001a\u0004\u0018\u00010,H\u00c6\u0001\u00a2\u0006\u0004\u0008\\\u0010]J\u0010\u0010^\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008^\u00106J\u0010\u0010_\u001a\u000200H\u00d6\u0001\u00a2\u0006\u0004\u0008_\u0010`J\u001a\u0010c\u001a\u00020b2\u0008\u0010a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008c\u0010dJ\'\u0010m\u001a\u00020j2\u0006\u0010e\u001a\u00020\u00002\u0006\u0010g\u001a\u00020f2\u0006\u0010i\u001a\u00020hH\u0001\u00a2\u0006\u0004\u0008k\u0010lR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010n\u0012\u0004\u0008p\u0010q\u001a\u0004\u0008o\u00106R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010r\u0012\u0004\u0008t\u0010q\u001a\u0004\u0008s\u00108R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010u\u0012\u0004\u0008w\u0010q\u001a\u0004\u0008v\u0010:R \u0010\u0008\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010u\u0012\u0004\u0008y\u0010q\u001a\u0004\u0008x\u0010:R \u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010u\u0012\u0004\u0008{\u0010q\u001a\u0004\u0008z\u0010:R\"\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\n\u0010u\u0012\u0004\u0008}\u0010q\u001a\u0004\u0008|\u0010:R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010n\u0012\u0004\u0008\u007f\u0010q\u001a\u0004\u0008~\u00106R\"\u0010\u000c\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008\u000c\u0010n\u0012\u0005\u0008\u0081\u0001\u0010q\u001a\u0005\u0008\u0080\u0001\u00106R%\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\u000e\u0010\u0082\u0001\u0012\u0005\u0008\u0084\u0001\u0010q\u001a\u0005\u0008\u0083\u0001\u0010AR)\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\u0011\u0010\u0085\u0001\u0012\u0005\u0008\u0087\u0001\u0010q\u001a\u0005\u0008\u0086\u0001\u0010CR%\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\u0013\u0010\u0088\u0001\u0012\u0005\u0008\u008a\u0001\u0010q\u001a\u0005\u0008\u0089\u0001\u0010ER%\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\u0015\u0010\u008b\u0001\u0012\u0005\u0008\u008d\u0001\u0010q\u001a\u0005\u0008\u008c\u0001\u0010GR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008\u0016\u0010n\u0012\u0005\u0008\u008f\u0001\u0010q\u001a\u0005\u0008\u008e\u0001\u00106R%\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\u0018\u0010\u0090\u0001\u0012\u0005\u0008\u0092\u0001\u0010q\u001a\u0005\u0008\u0091\u0001\u0010JR%\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\u0019\u0010\u0090\u0001\u0012\u0005\u0008\u0094\u0001\u0010q\u001a\u0005\u0008\u0093\u0001\u0010JR%\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\u001b\u0010\u0095\u0001\u0012\u0005\u0008\u0097\u0001\u0010q\u001a\u0005\u0008\u0096\u0001\u0010MR%\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\u001d\u0010\u0098\u0001\u0012\u0005\u0008\u009a\u0001\u0010q\u001a\u0005\u0008\u0099\u0001\u0010OR)\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\u001f\u0010\u0085\u0001\u0012\u0005\u0008\u009c\u0001\u0010q\u001a\u0005\u0008\u009b\u0001\u0010CR%\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008!\u0010\u009d\u0001\u0012\u0005\u0008\u009f\u0001\u0010q\u001a\u0005\u0008\u009e\u0001\u0010RR+\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\"\u0010\u0085\u0001\u0012\u0005\u0008\u00a1\u0001\u0010q\u001a\u0005\u0008\u00a0\u0001\u0010CR+\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008$\u0010\u0085\u0001\u0012\u0005\u0008\u00a3\u0001\u0010q\u001a\u0005\u0008\u00a2\u0001\u0010CR$\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0014\n\u0004\u0008%\u0010n\u0012\u0005\u0008\u00a5\u0001\u0010q\u001a\u0005\u0008\u00a4\u0001\u00106R+\u0010\'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008\'\u0010\u0085\u0001\u0012\u0005\u0008\u00a7\u0001\u0010q\u001a\u0005\u0008\u00a6\u0001\u0010CR%\u0010)\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004\u00a2\u0006\u0015\n\u0005\u0008)\u0010\u00a8\u0001\u0012\u0005\u0008\u00aa\u0001\u0010q\u001a\u0005\u0008\u00a9\u0001\u0010XR!\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u000f8\u0006\u00a2\u0006\u000e\n\u0005\u0008+\u0010\u0085\u0001\u001a\u0005\u0008\u00ab\u0001\u0010CR\u001b\u0010-\u001a\u0004\u0018\u00010,8\u0006\u00a2\u0006\u000e\n\u0005\u0008-\u0010\u00ac\u0001\u001a\u0005\u0008\u00ad\u0001\u0010[\u00a8\u0006\u00b0\u0001"
    }
    d2 = {
        "Lcom/whoop/trends/data/model/TrendsDtoV3;",
        "",
        "",
        "title",
        "Lcom/whoop/trends/data/model/SegmentControllerDtoV3;",
        "segmentController",
        "Lcom/whoop/trends/data/model/TimeSegmentDtoV3;",
        "weekTimeSegment",
        "monthTimeSegment",
        "sixMonthTimeSegment",
        "allTimeSegment",
        "noDataGraphText",
        "noDataGraphSubText",
        "Lcom/whoop/trends/data/model/MetricEducationV3;",
        "metricEducation",
        "",
        "Lcom/whoop/trends/data/model/NavigationSectionV3;",
        "navigationSections",
        "Lcom/whoop/design/models/items/ArticleTileCarouselModel;",
        "educationCarouselModel",
        "Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;",
        "integrationsUpsell",
        "infoCalloutDisplay",
        "Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;",
        "manualMeasurementItem",
        "seeAllDataItem",
        "Lcom/whoop/trends/data/model/ManualMeasurementSheet;",
        "manualMeasurementSheet",
        "Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;",
        "upsellCard",
        "Lcom/whoop/design/models/items/MenuItemModel;",
        "trendMenuList",
        "Lcom/whoop/trends/data/model/CardioFitnessLevelModel;",
        "cardioFitnessLevel",
        "metricEducationList",
        "Lcom/whoop/design/models/InfoCalloutTileModel;",
        "infoCalloutList",
        "manualMeasurementTextDisplay",
        "Lcom/whoop/trends/data/model/TrendMenuItemModel;",
        "trendMenus",
        "Lcom/whoop/design/models/items/AdditionalInfoTextModel;",
        "additionalInfoText",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "designItems",
        "Lcom/whoop/trends/data/model/MetaData;",
        "metadata",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/MetricEducationV3;Ljava/util/List;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;Ljava/util/List;Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Ljava/util/List;Lcom/whoop/trends/data/model/MetaData;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/MetricEducationV3;Ljava/util/List;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;Ljava/util/List;Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Ljava/util/List;Lcom/whoop/trends/data/model/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/trends/data/model/SegmentControllerDtoV3;",
        "component3",
        "()Lcom/whoop/trends/data/model/TimeSegmentDtoV3;",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "()Lcom/whoop/trends/data/model/MetricEducationV3;",
        "component10",
        "()Ljava/util/List;",
        "component11",
        "()Lcom/whoop/design/models/items/ArticleTileCarouselModel;",
        "component12",
        "()Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;",
        "component13",
        "component14",
        "()Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;",
        "component15",
        "component16",
        "()Lcom/whoop/trends/data/model/ManualMeasurementSheet;",
        "component17",
        "()Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;",
        "component18",
        "component19",
        "()Lcom/whoop/trends/data/model/CardioFitnessLevelModel;",
        "component20",
        "component21",
        "component22",
        "component23",
        "component24",
        "()Lcom/whoop/design/models/items/AdditionalInfoTextModel;",
        "component25",
        "component26",
        "()Lcom/whoop/trends/data/model/MetaData;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/MetricEducationV3;Ljava/util/List;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;Ljava/util/List;Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Ljava/util/List;Lcom/whoop/trends/data/model/MetaData;)Lcom/whoop/trends/data/model/TrendsDtoV3;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$trends_release",
        "(Lcom/whoop/trends/data/model/TrendsDtoV3;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getTitle",
        "getTitle$annotations",
        "()V",
        "Lcom/whoop/trends/data/model/SegmentControllerDtoV3;",
        "getSegmentController",
        "getSegmentController$annotations",
        "Lcom/whoop/trends/data/model/TimeSegmentDtoV3;",
        "getWeekTimeSegment",
        "getWeekTimeSegment$annotations",
        "getMonthTimeSegment",
        "getMonthTimeSegment$annotations",
        "getSixMonthTimeSegment",
        "getSixMonthTimeSegment$annotations",
        "getAllTimeSegment",
        "getAllTimeSegment$annotations",
        "getNoDataGraphText",
        "getNoDataGraphText$annotations",
        "getNoDataGraphSubText",
        "getNoDataGraphSubText$annotations",
        "Lcom/whoop/trends/data/model/MetricEducationV3;",
        "getMetricEducation",
        "getMetricEducation$annotations",
        "Ljava/util/List;",
        "getNavigationSections",
        "getNavigationSections$annotations",
        "Lcom/whoop/design/models/items/ArticleTileCarouselModel;",
        "getEducationCarouselModel",
        "getEducationCarouselModel$annotations",
        "Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;",
        "getIntegrationsUpsell",
        "getIntegrationsUpsell$annotations",
        "getInfoCalloutDisplay",
        "getInfoCalloutDisplay$annotations",
        "Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;",
        "getManualMeasurementItem",
        "getManualMeasurementItem$annotations",
        "getSeeAllDataItem",
        "getSeeAllDataItem$annotations",
        "Lcom/whoop/trends/data/model/ManualMeasurementSheet;",
        "getManualMeasurementSheet",
        "getManualMeasurementSheet$annotations",
        "Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;",
        "getUpsellCard",
        "getUpsellCard$annotations",
        "getTrendMenuList",
        "getTrendMenuList$annotations",
        "Lcom/whoop/trends/data/model/CardioFitnessLevelModel;",
        "getCardioFitnessLevel",
        "getCardioFitnessLevel$annotations",
        "getMetricEducationList",
        "getMetricEducationList$annotations",
        "getInfoCalloutList",
        "getInfoCalloutList$annotations",
        "getManualMeasurementTextDisplay",
        "getManualMeasurementTextDisplay$annotations",
        "getTrendMenus",
        "getTrendMenus$annotations",
        "Lcom/whoop/design/models/items/AdditionalInfoTextModel;",
        "getAdditionalInfoText",
        "getAdditionalInfoText$annotations",
        "getDesignItems",
        "Lcom/whoop/trends/data/model/MetaData;",
        "getMetadata",
        "Companion",
        "$serializer",
        "trends_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/trends/data/model/TrendsDtoV3$Companion;


# instance fields
.field private final additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "additional_info_text"
    .end annotation
.end field

.field private final allTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "all_time_segment"
    .end annotation
.end field

.field private final cardioFitnessLevel:Lcom/whoop/trends/data/model/CardioFitnessLevelModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cardio_fitness_level"
    .end annotation
.end field

.field private final designItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final educationCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "education_carousel"
    .end annotation
.end field

.field private final infoCalloutDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "info_callout_display"
    .end annotation
.end field

.field private final infoCalloutList:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "info_callouts"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/InfoCalloutTileModel;",
            ">;"
        }
    .end annotation
.end field

.field private final integrationsUpsell:Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "integrations_upsell"
    .end annotation
.end field

.field private final manualMeasurementItem:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "manual_measurement_item"
    .end annotation
.end field

.field private final manualMeasurementSheet:Lcom/whoop/trends/data/model/ManualMeasurementSheet;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "manual_measurement_sheet"
    .end annotation
.end field

.field private final manualMeasurementTextDisplay:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "manual_measurement_text_display"
    .end annotation
.end field

.field private final metadata:Lcom/whoop/trends/data/model/MetaData;

.field private final metricEducation:Lcom/whoop/trends/data/model/MetricEducationV3;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "metric_education"
    .end annotation
.end field

.field private final metricEducationList:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "metric_education_list"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/MetricEducationV3;",
            ">;"
        }
    .end annotation
.end field

.field private final monthTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "month_time_segment"
    .end annotation
.end field

.field private final navigationSections:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "navigation_sections"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/NavigationSectionV3;",
            ">;"
        }
    .end annotation
.end field

.field private final noDataGraphSubText:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "no_data_subtext_name_display"
    .end annotation
.end field

.field private final noDataGraphText:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "no_data_name_display"
    .end annotation
.end field

.field private final seeAllDataItem:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "see_all_data_item"
    .end annotation
.end field

.field private final segmentController:Lcom/whoop/trends/data/model/SegmentControllerDtoV3;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "segment_controller"
    .end annotation
.end field

.field private final sixMonthTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "six_month_time_segment"
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "header_name_display"
    .end annotation
.end field

.field private final trendMenuList:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "trend_menu_list"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/MenuItemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final trendMenus:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "trend_menus"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/TrendMenuItemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final upsellCard:Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "upsell_card"
    .end annotation
.end field

.field private final weekTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "week_time_segment"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lcom/whoop/trends/data/model/TrendsDtoV3$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/trends/data/model/TrendsDtoV3$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->Companion:Lcom/whoop/trends/data/model/TrendsDtoV3$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lwl2/a;

    const/16 v4, 0xd

    invoke-direct {v3, v4}, Lwl2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lwl2/a;

    const/16 v6, 0xe

    invoke-direct {v5, v6}, Lwl2/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lwl2/a;

    const/16 v8, 0xf

    invoke-direct {v7, v8}, Lwl2/a;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v9, Lwl2/a;

    const/16 v10, 0x10

    invoke-direct {v9, v10}, Lwl2/a;-><init>(I)V

    invoke-static {v2, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v9

    new-instance v11, Lwl2/a;

    const/16 v12, 0x11

    invoke-direct {v11, v12}, Lwl2/a;-><init>(I)V

    invoke-static {v2, v11}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v11

    new-instance v13, Lwl2/a;

    const/16 v14, 0x12

    invoke-direct {v13, v14}, Lwl2/a;-><init>(I)V

    invoke-static {v2, v13}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v13, 0x1a

    new-array v13, v13, [Ll83/h;

    const/4 v15, 0x0

    aput-object v1, v13, v15

    const/4 v15, 0x1

    aput-object v1, v13, v15

    const/4 v15, 0x2

    aput-object v1, v13, v15

    const/4 v15, 0x3

    aput-object v1, v13, v15

    const/4 v15, 0x4

    aput-object v1, v13, v15

    const/4 v15, 0x5

    aput-object v1, v13, v15

    const/4 v15, 0x6

    aput-object v1, v13, v15

    const/4 v15, 0x7

    aput-object v1, v13, v15

    aput-object v1, v13, v0

    const/16 v0, 0x9

    aput-object v3, v13, v0

    const/16 v0, 0xa

    aput-object v1, v13, v0

    const/16 v0, 0xb

    aput-object v1, v13, v0

    const/16 v0, 0xc

    aput-object v1, v13, v0

    aput-object v1, v13, v4

    aput-object v1, v13, v6

    aput-object v1, v13, v8

    aput-object v1, v13, v10

    aput-object v5, v13, v12

    aput-object v1, v13, v14

    const/16 v0, 0x13

    aput-object v7, v13, v0

    const/16 v0, 0x14

    aput-object v9, v13, v0

    const/16 v0, 0x15

    aput-object v1, v13, v0

    const/16 v0, 0x16

    aput-object v11, v13, v0

    const/16 v0, 0x17

    aput-object v1, v13, v0

    const/16 v0, 0x18

    aput-object v2, v13, v0

    const/16 v0, 0x19

    aput-object v1, v13, v0

    sput-object v13, Lcom/whoop/trends/data/model/TrendsDtoV3;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/MetricEducationV3;Ljava/util/List;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;Ljava/util/List;Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Ljava/util/List;Lcom/whoop/trends/data/model/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0xfffeff

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/trends/data/model/TrendsDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TrendsDtoV3$$serializer;

    invoke-virtual {v1}, Lcom/whoop/trends/data/model/TrendsDtoV3$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->segmentController:Lcom/whoop/trends/data/model/SegmentControllerDtoV3;

    iput-object p4, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->weekTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    iput-object p5, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->monthTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    iput-object p6, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->sixMonthTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    iput-object p7, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->allTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    iput-object p8, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->noDataGraphText:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->noDataGraphSubText:Ljava/lang/String;

    and-int/lit16 p2, p1, 0x100

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metricEducation:Lcom/whoop/trends/data/model/MetricEducationV3;

    goto :goto_0

    :cond_1
    iput-object p10, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metricEducation:Lcom/whoop/trends/data/model/MetricEducationV3;

    :goto_0
    iput-object p11, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->navigationSections:Ljava/util/List;

    iput-object p12, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->educationCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    iput-object p13, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->integrationsUpsell:Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;

    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->infoCalloutDisplay:Ljava/lang/String;

    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementItem:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->seeAllDataItem:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    move-object/from16 p2, p17

    iput-object p2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementSheet:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    move-object/from16 p2, p18

    iput-object p2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->upsellCard:Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;

    move-object/from16 p2, p19

    iput-object p2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->trendMenuList:Ljava/util/List;

    move-object/from16 p2, p20

    iput-object p2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->cardioFitnessLevel:Lcom/whoop/trends/data/model/CardioFitnessLevelModel;

    move-object/from16 p2, p21

    iput-object p2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metricEducationList:Ljava/util/List;

    move-object/from16 p2, p22

    iput-object p2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->infoCalloutList:Ljava/util/List;

    move-object/from16 p2, p23

    iput-object p2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementTextDisplay:Ljava/lang/String;

    move-object/from16 p2, p24

    iput-object p2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->trendMenus:Ljava/util/List;

    move-object/from16 p2, p25

    iput-object p2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    const/high16 p2, 0x1000000

    and-int/2addr p2, p1

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->designItems:Ljava/util/List;

    goto :goto_1

    :cond_2
    move-object/from16 p2, p26

    iput-object p2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->designItems:Ljava/util/List;

    :goto_1
    const/high16 p2, 0x2000000

    and-int/2addr p1, p2

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metadata:Lcom/whoop/trends/data/model/MetaData;

    return-void

    :cond_3
    move-object/from16 p1, p27

    iput-object p1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metadata:Lcom/whoop/trends/data/model/MetaData;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/MetricEducationV3;Ljava/util/List;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;Ljava/util/List;Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Ljava/util/List;Lcom/whoop/trends/data/model/MetaData;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/trends/data/model/SegmentControllerDtoV3;",
            "Lcom/whoop/trends/data/model/TimeSegmentDtoV3;",
            "Lcom/whoop/trends/data/model/TimeSegmentDtoV3;",
            "Lcom/whoop/trends/data/model/TimeSegmentDtoV3;",
            "Lcom/whoop/trends/data/model/TimeSegmentDtoV3;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/trends/data/model/MetricEducationV3;",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/NavigationSectionV3;",
            ">;",
            "Lcom/whoop/design/models/items/ArticleTileCarouselModel;",
            "Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;",
            "Ljava/lang/String;",
            "Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;",
            "Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;",
            "Lcom/whoop/trends/data/model/ManualMeasurementSheet;",
            "Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/MenuItemModel;",
            ">;",
            "Lcom/whoop/trends/data/model/CardioFitnessLevelModel;",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/MetricEducationV3;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/InfoCalloutTileModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/TrendMenuItemModel;",
            ">;",
            "Lcom/whoop/design/models/items/AdditionalInfoTextModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/trends/data/model/MetaData;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p18

    const-string v1, "title"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "segmentController"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "monthTimeSegment"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "sixMonthTimeSegment"

    invoke-static {p5, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "noDataGraphText"

    invoke-static {p7, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "noDataGraphSubText"

    invoke-static {p8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "navigationSections"

    invoke-static {p10, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "trendMenuList"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->segmentController:Lcom/whoop/trends/data/model/SegmentControllerDtoV3;

    .line 5
    iput-object p3, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->weekTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    .line 6
    iput-object p4, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->monthTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    .line 7
    iput-object p5, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->sixMonthTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    .line 8
    iput-object p6, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->allTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    .line 9
    iput-object p7, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->noDataGraphText:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->noDataGraphSubText:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metricEducation:Lcom/whoop/trends/data/model/MetricEducationV3;

    .line 12
    iput-object p10, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->navigationSections:Ljava/util/List;

    .line 13
    iput-object p11, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->educationCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    .line 14
    iput-object p12, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->integrationsUpsell:Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;

    move-object p1, p13

    .line 15
    iput-object p1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->infoCalloutDisplay:Ljava/lang/String;

    move-object/from16 p1, p14

    .line 16
    iput-object p1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementItem:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->seeAllDataItem:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementSheet:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->upsellCard:Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;

    .line 20
    iput-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->trendMenuList:Ljava/util/List;

    move-object/from16 p1, p19

    .line 21
    iput-object p1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->cardioFitnessLevel:Lcom/whoop/trends/data/model/CardioFitnessLevelModel;

    move-object/from16 p1, p20

    .line 22
    iput-object p1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metricEducationList:Ljava/util/List;

    move-object/from16 p1, p21

    .line 23
    iput-object p1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->infoCalloutList:Ljava/util/List;

    move-object/from16 p1, p22

    .line 24
    iput-object p1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementTextDisplay:Ljava/lang/String;

    move-object/from16 p1, p23

    .line 25
    iput-object p1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->trendMenus:Ljava/util/List;

    move-object/from16 p1, p24

    .line 26
    iput-object p1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    move-object/from16 p1, p25

    .line 27
    iput-object p1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->designItems:Ljava/util/List;

    move-object/from16 p1, p26

    .line 28
    iput-object p1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metadata:Lcom/whoop/trends/data/model/MetaData;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/MetricEducationV3;Ljava/util/List;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;Ljava/util/List;Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Ljava/util/List;Lcom/whoop/trends/data/model/MetaData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 30

    move/from16 v0, p27

    and-int/lit16 v1, v0, 0x100

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v12, v2

    goto :goto_0

    :cond_0
    move-object/from16 v12, p9

    :goto_0
    const/high16 v1, 0x1000000

    and-int/2addr v1, v0

    if-eqz v1, :cond_1

    move-object/from16 v28, v2

    goto :goto_1

    :cond_1
    move-object/from16 v28, p25

    :goto_1
    const/high16 v1, 0x2000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_2

    move-object/from16 v29, v2

    :goto_2
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    move-object/from16 v15, p12

    move-object/from16 v16, p13

    move-object/from16 v17, p14

    move-object/from16 v18, p15

    move-object/from16 v19, p16

    move-object/from16 v20, p17

    move-object/from16 v21, p18

    move-object/from16 v22, p19

    move-object/from16 v23, p20

    move-object/from16 v24, p21

    move-object/from16 v25, p22

    move-object/from16 v26, p23

    move-object/from16 v27, p24

    goto :goto_3

    :cond_2
    move-object/from16 v29, p26

    goto :goto_2

    .line 29
    :goto_3
    invoke-direct/range {v3 .. v29}, Lcom/whoop/trends/data/model/TrendsDtoV3;-><init>(Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/MetricEducationV3;Ljava/util/List;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;Ljava/util/List;Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Ljava/util/List;Lcom/whoop/trends/data/model/MetaData;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/trends/data/model/NavigationSectionV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/NavigationSectionV3$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/MenuItemModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/MenuItemModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/trends/data/model/MetricEducationV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/MetricEducationV3$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;->INSTANCE:Lcom/whoop/design/models/InfoCalloutTileModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$3()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/trends/data/model/TrendMenuItemModel$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TrendMenuItemModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$4()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/trends/data/model/TrendsDtoV3;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/trends/data/model/TrendsDtoV3;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/trends/data/model/TrendsDtoV3;->_childSerializers$_anonymous_$4()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/trends/data/model/TrendsDtoV3;Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/MetricEducationV3;Ljava/util/List;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;Ljava/util/List;Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Ljava/util/List;Lcom/whoop/trends/data/model/MetaData;ILjava/lang/Object;)Lcom/whoop/trends/data/model/TrendsDtoV3;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p27

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->title:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->segmentController:Lcom/whoop/trends/data/model/SegmentControllerDtoV3;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->weekTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->monthTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->sixMonthTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->allTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->noDataGraphText:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->noDataGraphSubText:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metricEducation:Lcom/whoop/trends/data/model/MetricEducationV3;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->navigationSections:Ljava/util/List;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->educationCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->integrationsUpsell:Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->infoCalloutDisplay:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementItem:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->seeAllDataItem:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementSheet:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p27, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->upsellCard:Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p27, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->trendMenuList:Ljava/util/List;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p27, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->cardioFitnessLevel:Lcom/whoop/trends/data/model/CardioFitnessLevelModel;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p27, v16

    move-object/from16 p5, v1

    if-eqz v16, :cond_13

    iget-object v1, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metricEducationList:Ljava/util/List;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p20

    :goto_13
    const/high16 v16, 0x100000

    and-int v16, p27, v16

    move-object/from16 p6, v1

    if-eqz v16, :cond_14

    iget-object v1, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->infoCalloutList:Ljava/util/List;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p21

    :goto_14
    const/high16 v16, 0x200000

    and-int v16, p27, v16

    move-object/from16 p7, v1

    if-eqz v16, :cond_15

    iget-object v1, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementTextDisplay:Ljava/lang/String;

    goto :goto_15

    :cond_15
    move-object/from16 v1, p22

    :goto_15
    const/high16 v16, 0x400000

    and-int v16, p27, v16

    move-object/from16 p8, v1

    if-eqz v16, :cond_16

    iget-object v1, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->trendMenus:Ljava/util/List;

    goto :goto_16

    :cond_16
    move-object/from16 v1, p23

    :goto_16
    const/high16 v16, 0x800000

    and-int v16, p27, v16

    move-object/from16 p9, v1

    if-eqz v16, :cond_17

    iget-object v1, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    goto :goto_17

    :cond_17
    move-object/from16 v1, p24

    :goto_17
    const/high16 v16, 0x1000000

    and-int v16, p27, v16

    move-object/from16 p10, v1

    if-eqz v16, :cond_18

    iget-object v1, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->designItems:Ljava/util/List;

    goto :goto_18

    :cond_18
    move-object/from16 v1, p25

    :goto_18
    const/high16 v16, 0x2000000

    and-int v16, p27, v16

    if-eqz v16, :cond_19

    move-object/from16 p11, v1

    iget-object v1, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metadata:Lcom/whoop/trends/data/model/MetaData;

    move-object/from16 p26, p11

    move-object/from16 p27, v1

    :goto_19
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p20, p5

    move-object/from16 p21, p6

    move-object/from16 p22, p7

    move-object/from16 p23, p8

    move-object/from16 p24, p9

    move-object/from16 p25, p10

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_1a

    :cond_19
    move-object/from16 p27, p26

    move-object/from16 p26, v1

    goto :goto_19

    :goto_1a
    invoke-virtual/range {p1 .. p27}, Lcom/whoop/trends/data/model/TrendsDtoV3;->copy(Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/MetricEducationV3;Ljava/util/List;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;Ljava/util/List;Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Ljava/util/List;Lcom/whoop/trends/data/model/MetaData;)Lcom/whoop/trends/data/model/TrendsDtoV3;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/trends/data/model/TrendsDtoV3;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/trends/data/model/TrendsDtoV3;->_childSerializers$_anonymous_$3()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/trends/data/model/TrendsDtoV3;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getAdditionalInfoText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "additional_info_text"
    .end annotation

    return-void
.end method

.method public static synthetic getAllTimeSegment$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "all_time_segment"
    .end annotation

    return-void
.end method

.method public static synthetic getCardioFitnessLevel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "cardio_fitness_level"
    .end annotation

    return-void
.end method

.method public static synthetic getEducationCarouselModel$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "education_carousel"
    .end annotation

    return-void
.end method

.method public static synthetic getInfoCalloutDisplay$annotations()V
    .locals 0
    .annotation runtime Ll83/c;
    .end annotation

    .annotation runtime Lwc3/h;
        value = "info_callout_display"
    .end annotation

    return-void
.end method

.method public static synthetic getInfoCalloutList$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "info_callouts"
    .end annotation

    return-void
.end method

.method public static synthetic getIntegrationsUpsell$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "integrations_upsell"
    .end annotation

    return-void
.end method

.method public static synthetic getManualMeasurementItem$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "manual_measurement_item"
    .end annotation

    return-void
.end method

.method public static synthetic getManualMeasurementSheet$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "manual_measurement_sheet"
    .end annotation

    return-void
.end method

.method public static synthetic getManualMeasurementTextDisplay$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "manual_measurement_text_display"
    .end annotation

    return-void
.end method

.method public static synthetic getMetricEducation$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "metric_education"
    .end annotation

    return-void
.end method

.method public static synthetic getMetricEducationList$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "metric_education_list"
    .end annotation

    return-void
.end method

.method public static synthetic getMonthTimeSegment$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "month_time_segment"
    .end annotation

    return-void
.end method

.method public static synthetic getNavigationSections$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "navigation_sections"
    .end annotation

    return-void
.end method

.method public static synthetic getNoDataGraphSubText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "no_data_subtext_name_display"
    .end annotation

    return-void
.end method

.method public static synthetic getNoDataGraphText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "no_data_name_display"
    .end annotation

    return-void
.end method

.method public static synthetic getSeeAllDataItem$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "see_all_data_item"
    .end annotation

    return-void
.end method

.method public static synthetic getSegmentController$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "segment_controller"
    .end annotation

    return-void
.end method

.method public static synthetic getSixMonthTimeSegment$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "six_month_time_segment"
    .end annotation

    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "header_name_display"
    .end annotation

    return-void
.end method

.method public static synthetic getTrendMenuList$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "trend_menu_list"
    .end annotation

    return-void
.end method

.method public static synthetic getTrendMenus$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "trend_menus"
    .end annotation

    return-void
.end method

.method public static synthetic getUpsellCard$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "upsell_card"
    .end annotation

    return-void
.end method

.method public static synthetic getWeekTimeSegment$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "week_time_segment"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$trends_release(Lcom/whoop/trends/data/model/TrendsDtoV3;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/trends/data/model/SegmentControllerDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/SegmentControllerDtoV3$$serializer;

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->segmentController:Lcom/whoop/trends/data/model/SegmentControllerDtoV3;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/trends/data/model/TimeSegmentDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TimeSegmentDtoV3$$serializer;

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->weekTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->monthTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->sixMonthTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->allTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->noDataGraphText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->noDataGraphSubText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metricEducation:Lcom/whoop/trends/data/model/MetricEducationV3;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lcom/whoop/trends/data/model/MetricEducationV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/MetricEducationV3$$serializer;

    iget-object v3, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metricEducation:Lcom/whoop/trends/data/model/MetricEducationV3;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/16 v1, 0x9

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->navigationSections:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/ArticleTileCarouselModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ArticleTileCarouselModel$$serializer;

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->educationCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    const/16 v3, 0xa

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3$$serializer;

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->integrationsUpsell:Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;

    const/16 v3, 0xb

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->infoCalloutDisplay:Ljava/lang/String;

    const/16 v3, 0xc

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3$$serializer;

    iget-object v3, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementItem:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    const/16 v4, 0xd

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v3, 0xe

    iget-object v4, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->seeAllDataItem:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    invoke-interface {p1, p2, v3, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/trends/data/model/ManualMeasurementSheet$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/ManualMeasurementSheet$$serializer;

    iget-object v3, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementSheet:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    const/16 v4, 0xf

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/cards/TextWithIllustrationCardModel$$serializer;

    iget-object v3, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->upsellCard:Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;

    const/16 v4, 0x10

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x11

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->trendMenuList:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/trends/data/model/CardioFitnessLevelModel$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/CardioFitnessLevelModel$$serializer;

    iget-object v3, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->cardioFitnessLevel:Lcom/whoop/trends/data/model/CardioFitnessLevelModel;

    const/16 v4, 0x12

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x13

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metricEducationList:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x14

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->infoCalloutList:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x15

    iget-object v3, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementTextDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x16

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->trendMenus:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AdditionalInfoTextModel$$serializer;

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    const/16 v3, 0x17

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0x18

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->designItems:Ljava/util/List;

    if-eqz v2, :cond_3

    :goto_1
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->designItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/16 v0, 0x19

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metadata:Lcom/whoop/trends/data/model/MetaData;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/whoop/trends/data/model/MetaData$$serializer;->INSTANCE:Lcom/whoop/trends/data/model/MetaData$$serializer;

    iget-object p0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metadata:Lcom/whoop/trends/data/model/MetaData;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/NavigationSectionV3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->navigationSections:Ljava/util/List;

    return-object v0
.end method

.method public final component11()Lcom/whoop/design/models/items/ArticleTileCarouselModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->educationCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    return-object v0
.end method

.method public final component12()Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->integrationsUpsell:Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->infoCalloutDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementItem:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    return-object v0
.end method

.method public final component15()Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->seeAllDataItem:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    return-object v0
.end method

.method public final component16()Lcom/whoop/trends/data/model/ManualMeasurementSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementSheet:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    return-object v0
.end method

.method public final component17()Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->upsellCard:Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;

    return-object v0
.end method

.method public final component18()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/MenuItemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->trendMenuList:Ljava/util/List;

    return-object v0
.end method

.method public final component19()Lcom/whoop/trends/data/model/CardioFitnessLevelModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->cardioFitnessLevel:Lcom/whoop/trends/data/model/CardioFitnessLevelModel;

    return-object v0
.end method

.method public final component2()Lcom/whoop/trends/data/model/SegmentControllerDtoV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->segmentController:Lcom/whoop/trends/data/model/SegmentControllerDtoV3;

    return-object v0
.end method

.method public final component20()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/MetricEducationV3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metricEducationList:Ljava/util/List;

    return-object v0
.end method

.method public final component21()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/InfoCalloutTileModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->infoCalloutList:Ljava/util/List;

    return-object v0
.end method

.method public final component22()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component23()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/TrendMenuItemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->trendMenus:Ljava/util/List;

    return-object v0
.end method

.method public final component24()Lcom/whoop/design/models/items/AdditionalInfoTextModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    return-object v0
.end method

.method public final component25()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->designItems:Ljava/util/List;

    return-object v0
.end method

.method public final component26()Lcom/whoop/trends/data/model/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metadata:Lcom/whoop/trends/data/model/MetaData;

    return-object v0
.end method

.method public final component3()Lcom/whoop/trends/data/model/TimeSegmentDtoV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->weekTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    return-object v0
.end method

.method public final component4()Lcom/whoop/trends/data/model/TimeSegmentDtoV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->monthTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    return-object v0
.end method

.method public final component5()Lcom/whoop/trends/data/model/TimeSegmentDtoV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->sixMonthTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    return-object v0
.end method

.method public final component6()Lcom/whoop/trends/data/model/TimeSegmentDtoV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->allTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->noDataGraphText:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->noDataGraphSubText:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Lcom/whoop/trends/data/model/MetricEducationV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metricEducation:Lcom/whoop/trends/data/model/MetricEducationV3;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/MetricEducationV3;Ljava/util/List;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;Ljava/util/List;Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Ljava/util/List;Lcom/whoop/trends/data/model/MetaData;)Lcom/whoop/trends/data/model/TrendsDtoV3;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/trends/data/model/SegmentControllerDtoV3;",
            "Lcom/whoop/trends/data/model/TimeSegmentDtoV3;",
            "Lcom/whoop/trends/data/model/TimeSegmentDtoV3;",
            "Lcom/whoop/trends/data/model/TimeSegmentDtoV3;",
            "Lcom/whoop/trends/data/model/TimeSegmentDtoV3;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/trends/data/model/MetricEducationV3;",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/NavigationSectionV3;",
            ">;",
            "Lcom/whoop/design/models/items/ArticleTileCarouselModel;",
            "Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;",
            "Ljava/lang/String;",
            "Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;",
            "Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;",
            "Lcom/whoop/trends/data/model/ManualMeasurementSheet;",
            "Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/MenuItemModel;",
            ">;",
            "Lcom/whoop/trends/data/model/CardioFitnessLevelModel;",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/MetricEducationV3;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/InfoCalloutTileModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/TrendMenuItemModel;",
            ">;",
            "Lcom/whoop/design/models/items/AdditionalInfoTextModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/trends/data/model/MetaData;",
            ")",
            "Lcom/whoop/trends/data/model/TrendsDtoV3;"
        }
    .end annotation

    const-string v0, "title"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segmentController"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "monthTimeSegment"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sixMonthTimeSegment"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "noDataGraphText"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "noDataGraphSubText"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationSections"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trendMenuList"

    move-object/from16 v1, p18

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/trends/data/model/TrendsDtoV3;

    move-object/from16 v4, p3

    move-object/from16 v7, p6

    move-object/from16 v10, p9

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    move-object/from16 v25, p24

    move-object/from16 v26, p25

    move-object/from16 v27, p26

    invoke-direct/range {v1 .. v27}, Lcom/whoop/trends/data/model/TrendsDtoV3;-><init>(Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/MetricEducationV3;Ljava/util/List;Lcom/whoop/design/models/items/ArticleTileCarouselModel;Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;Ljava/lang/String;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;Lcom/whoop/trends/data/model/ManualMeasurementSheet;Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;Ljava/util/List;Lcom/whoop/trends/data/model/CardioFitnessLevelModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Ljava/util/List;Lcom/whoop/trends/data/model/MetaData;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/trends/data/model/TrendsDtoV3;

    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->segmentController:Lcom/whoop/trends/data/model/SegmentControllerDtoV3;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->segmentController:Lcom/whoop/trends/data/model/SegmentControllerDtoV3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->weekTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->weekTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->monthTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->monthTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->sixMonthTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->sixMonthTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->allTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->allTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->noDataGraphText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->noDataGraphText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->noDataGraphSubText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->noDataGraphSubText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metricEducation:Lcom/whoop/trends/data/model/MetricEducationV3;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->metricEducation:Lcom/whoop/trends/data/model/MetricEducationV3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->navigationSections:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->navigationSections:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->educationCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->educationCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->integrationsUpsell:Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->integrationsUpsell:Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->infoCalloutDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->infoCalloutDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementItem:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementItem:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->seeAllDataItem:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->seeAllDataItem:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementSheet:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementSheet:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->upsellCard:Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->upsellCard:Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->trendMenuList:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->trendMenuList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->cardioFitnessLevel:Lcom/whoop/trends/data/model/CardioFitnessLevelModel;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->cardioFitnessLevel:Lcom/whoop/trends/data/model/CardioFitnessLevelModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metricEducationList:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->metricEducationList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->infoCalloutList:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->infoCalloutList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementTextDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementTextDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    return v2

    :cond_17
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->trendMenus:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->trendMenus:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->designItems:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->designItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metadata:Lcom/whoop/trends/data/model/MetaData;

    iget-object p1, p1, Lcom/whoop/trends/data/model/TrendsDtoV3;->metadata:Lcom/whoop/trends/data/model/MetaData;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1b

    return v2

    :cond_1b
    return v0
.end method

.method public final getAdditionalInfoText()Lcom/whoop/design/models/items/AdditionalInfoTextModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    return-object v0
.end method

.method public final getAllTimeSegment()Lcom/whoop/trends/data/model/TimeSegmentDtoV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->allTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    return-object v0
.end method

.method public final getCardioFitnessLevel()Lcom/whoop/trends/data/model/CardioFitnessLevelModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->cardioFitnessLevel:Lcom/whoop/trends/data/model/CardioFitnessLevelModel;

    return-object v0
.end method

.method public final getDesignItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->designItems:Ljava/util/List;

    return-object v0
.end method

.method public final getEducationCarouselModel()Lcom/whoop/design/models/items/ArticleTileCarouselModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->educationCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    return-object v0
.end method

.method public final getInfoCalloutDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->infoCalloutDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getInfoCalloutList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/InfoCalloutTileModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->infoCalloutList:Ljava/util/List;

    return-object v0
.end method

.method public final getIntegrationsUpsell()Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->integrationsUpsell:Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;

    return-object v0
.end method

.method public final getManualMeasurementItem()Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementItem:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    return-object v0
.end method

.method public final getManualMeasurementSheet()Lcom/whoop/trends/data/model/ManualMeasurementSheet;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementSheet:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    return-object v0
.end method

.method public final getManualMeasurementTextDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementTextDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getMetadata()Lcom/whoop/trends/data/model/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metadata:Lcom/whoop/trends/data/model/MetaData;

    return-object v0
.end method

.method public final getMetricEducation()Lcom/whoop/trends/data/model/MetricEducationV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metricEducation:Lcom/whoop/trends/data/model/MetricEducationV3;

    return-object v0
.end method

.method public final getMetricEducationList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/MetricEducationV3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metricEducationList:Ljava/util/List;

    return-object v0
.end method

.method public final getMonthTimeSegment()Lcom/whoop/trends/data/model/TimeSegmentDtoV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->monthTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    return-object v0
.end method

.method public final getNavigationSections()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/NavigationSectionV3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->navigationSections:Ljava/util/List;

    return-object v0
.end method

.method public final getNoDataGraphSubText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->noDataGraphSubText:Ljava/lang/String;

    return-object v0
.end method

.method public final getNoDataGraphText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->noDataGraphText:Ljava/lang/String;

    return-object v0
.end method

.method public final getSeeAllDataItem()Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->seeAllDataItem:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    return-object v0
.end method

.method public final getSegmentController()Lcom/whoop/trends/data/model/SegmentControllerDtoV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->segmentController:Lcom/whoop/trends/data/model/SegmentControllerDtoV3;

    return-object v0
.end method

.method public final getSixMonthTimeSegment()Lcom/whoop/trends/data/model/TimeSegmentDtoV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->sixMonthTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrendMenuList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/MenuItemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->trendMenuList:Ljava/util/List;

    return-object v0
.end method

.method public final getTrendMenus()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/TrendMenuItemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->trendMenus:Ljava/util/List;

    return-object v0
.end method

.method public final getUpsellCard()Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->upsellCard:Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;

    return-object v0
.end method

.method public final getWeekTimeSegment()Lcom/whoop/trends/data/model/TimeSegmentDtoV3;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->weekTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->segmentController:Lcom/whoop/trends/data/model/SegmentControllerDtoV3;

    invoke-virtual {v2}, Lcom/whoop/trends/data/model/SegmentControllerDtoV3;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->weekTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->monthTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    invoke-virtual {v0}, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->sixMonthTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    invoke-virtual {v2}, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->allTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->noDataGraphText:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->noDataGraphSubText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metricEducation:Lcom/whoop/trends/data/model/MetricEducationV3;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/trends/data/model/MetricEducationV3;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->navigationSections:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->educationCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/design/models/items/ArticleTileCarouselModel;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->integrationsUpsell:Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->infoCalloutDisplay:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementItem:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->seeAllDataItem:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementSheet:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Lcom/whoop/trends/data/model/ManualMeasurementSheet;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->upsellCard:Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->trendMenuList:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->cardioFitnessLevel:Lcom/whoop/trends/data/model/CardioFitnessLevelModel;

    if-nez v2, :cond_a

    move v2, v3

    goto :goto_a

    :cond_a
    invoke-virtual {v2}, Lcom/whoop/trends/data/model/CardioFitnessLevelModel;->hashCode()I

    move-result v2

    :goto_a
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metricEducationList:Ljava/util/List;

    if-nez v2, :cond_b

    move v2, v3

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_b
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->infoCalloutList:Ljava/util/List;

    if-nez v2, :cond_c

    move v2, v3

    goto :goto_c

    :cond_c
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_c
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementTextDisplay:Ljava/lang/String;

    if-nez v2, :cond_d

    move v2, v3

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_d
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->trendMenus:Ljava/util/List;

    if-nez v2, :cond_e

    move v2, v3

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_e
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    if-nez v2, :cond_f

    move v2, v3

    goto :goto_f

    :cond_f
    invoke-virtual {v2}, Lcom/whoop/design/models/items/AdditionalInfoTextModel;->hashCode()I

    move-result v2

    :goto_f
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->designItems:Ljava/util/List;

    if-nez v2, :cond_10

    move v2, v3

    goto :goto_10

    :cond_10
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_10
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metadata:Lcom/whoop/trends/data/model/MetaData;

    if-nez v1, :cond_11

    goto :goto_11

    :cond_11
    invoke-virtual {v1}, Lcom/whoop/trends/data/model/MetaData;->hashCode()I

    move-result v3

    :goto_11
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 28

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->title:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->segmentController:Lcom/whoop/trends/data/model/SegmentControllerDtoV3;

    iget-object v3, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->weekTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    iget-object v4, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->monthTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    iget-object v5, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->sixMonthTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    iget-object v6, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->allTimeSegment:Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    iget-object v7, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->noDataGraphText:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->noDataGraphSubText:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metricEducation:Lcom/whoop/trends/data/model/MetricEducationV3;

    iget-object v10, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->navigationSections:Ljava/util/List;

    iget-object v11, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->educationCarouselModel:Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    iget-object v12, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->integrationsUpsell:Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;

    iget-object v13, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->infoCalloutDisplay:Ljava/lang/String;

    iget-object v14, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementItem:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    iget-object v15, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->seeAllDataItem:Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementSheet:Lcom/whoop/trends/data/model/ManualMeasurementSheet;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->upsellCard:Lcom/whoop/design/models/cards/TextWithIllustrationCardModel;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->trendMenuList:Ljava/util/List;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->cardioFitnessLevel:Lcom/whoop/trends/data/model/CardioFitnessLevelModel;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metricEducationList:Ljava/util/List;

    move-object/from16 v21, v15

    iget-object v15, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->infoCalloutList:Ljava/util/List;

    move-object/from16 v22, v15

    iget-object v15, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->manualMeasurementTextDisplay:Ljava/lang/String;

    move-object/from16 v23, v15

    iget-object v15, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->trendMenus:Ljava/util/List;

    move-object/from16 v24, v15

    iget-object v15, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->additionalInfoText:Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    move-object/from16 v25, v15

    iget-object v15, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->designItems:Ljava/util/List;

    move-object/from16 v26, v15

    iget-object v15, v0, Lcom/whoop/trends/data/model/TrendsDtoV3;->metadata:Lcom/whoop/trends/data/model/MetaData;

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v27, v15

    const-string v15, "TrendsDtoV3(title="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", segmentController="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", weekTimeSegment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", monthTimeSegment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sixMonthTimeSegment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", allTimeSegment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", noDataGraphText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", noDataGraphSubText="

    const-string v2, ", metricEducation="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", navigationSections="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", educationCarouselModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", integrationsUpsell="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", infoCalloutDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", manualMeasurementItem="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", seeAllDataItem="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", manualMeasurementSheet="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", upsellCard="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", trendMenuList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cardioFitnessLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", metricEducationList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", infoCalloutList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", manualMeasurementTextDisplay="

    const-string v2, ", trendMenus="

    move-object/from16 v3, v22

    move-object/from16 v4, v23

    invoke-static {v1, v4, v2, v0, v3}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", additionalInfoText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", designItems="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", metadata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
