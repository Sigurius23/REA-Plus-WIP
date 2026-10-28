.class public final Ldd3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ldd3/a;


# instance fields
.field public final a:Lcd3/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldd3/a;

    invoke-direct {v0}, Ldd3/a;-><init>()V

    sput-object v0, Ldd3/a;->b:Ldd3/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lcd3/i;->a:Lcd3/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ldd3/a;->a:Lcd3/f;

    return-void
.end method


# virtual methods
.method public final a(Lwc3/b;[B)Ljava/lang/Object;
    .locals 4

    const-string v0, "deserializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Led3/a;

    array-length v1, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p2, v1, v2, v3}, Led3/a;-><init>([BIIZ)V

    new-instance p2, Led3/m;

    new-instance v1, Led3/o;

    invoke-direct {v1, v0}, Led3/o;-><init>(Led3/a;)V

    invoke-interface {p1}, Lwc3/b;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-direct {p2, p0, v1, v0}, Led3/m;-><init>(Ldd3/a;Led3/o;Lyc3/g;)V

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Led3/m;->K(Lwc3/b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lwc3/j;Ljava/lang/Object;)[B
    .locals 4

    const-string v0, "serializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Led3/b;

    invoke-direct {v0}, Led3/b;-><init>()V

    new-instance v1, Led3/n;

    new-instance v2, Le10/k0;

    const/4 v3, 0x3

    invoke-direct {v2, v0, v3}, Le10/k0;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v3

    invoke-direct {v1, p0, v2, v3}, Led3/n;-><init>(Ldd3/a;Le10/k0;Lyc3/g;)V

    invoke-virtual {v1, p1, p2}, Led3/n;->encodeSerializableValue(Lwc3/j;Ljava/lang/Object;)V

    iget p1, v0, Led3/b;->b:I

    new-array p2, p1, [B

    iget-object v0, v0, Led3/b;->a:[B

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v1, p1, v2, v0, p2}, Lm83/n;->h0(III[B[B)V

    return-object p2
.end method
