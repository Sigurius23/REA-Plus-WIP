.class public final Lcom/google/crypto/tink/shaded/protobuf/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lcom/google/crypto/tink/shaded/protobuf/u;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/u;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/shaded/protobuf/u;-><init>(I)V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/k0;->b:Lcom/google/crypto/tink/shaded/protobuf/u;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 4
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/j0;

    .line 5
    :try_start_0
    const-string v1, "com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 6
    const-string v2, "getInstance"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/crypto/tink/shaded/protobuf/o0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 7
    :catch_0
    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/k0;->b:Lcom/google/crypto/tink/shaded/protobuf/u;

    :goto_0
    const/4 v2, 0x2

    .line 8
    new-array v2, v2, [Lcom/google/crypto/tink/shaded/protobuf/o0;

    sget-object v3, Lcom/google/crypto/tink/shaded/protobuf/u;->b:Lcom/google/crypto/tink/shaded/protobuf/u;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v1, v2, v3

    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object v2, v0, Lcom/google/crypto/tink/shaded/protobuf/j0;->a:[Lcom/google/crypto/tink/shaded/protobuf/o0;

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    sget-object v1, Lcom/google/crypto/tink/shaded/protobuf/b0;->a:Ljava/nio/charset/Charset;

    iput-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k0;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/m;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string v0, "output"

    invoke-static {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/b0;->a(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/k0;->a:Ljava/lang/Object;

    .line 3
    iput-object p0, p1, Lcom/google/crypto/tink/shaded/protobuf/m;->b:Lcom/google/crypto/tink/shaded/protobuf/k0;

    return-void
.end method

.method public static a(Lcom/google/crypto/tink/shaded/protobuf/m;)Lcom/google/crypto/tink/shaded/protobuf/k0;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/m;->b:Lcom/google/crypto/tink/shaded/protobuf/k0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-direct {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/k0;-><init>(Lcom/google/crypto/tink/shaded/protobuf/m;)V

    return-object v0
.end method


# virtual methods
.method public b(ILcom/google/crypto/tink/shaded/protobuf/i;)V
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k0;->a:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/m;

    const/4 v1, 0x2

    invoke-virtual {v0, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/m;->y0(II)V

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/m;->z0(I)V

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/h;

    iget-object p1, p2, Lcom/google/crypto/tink/shaded/protobuf/h;->z:[B

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/h;->j()I

    move-result v1

    invoke-virtual {p2}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result p2

    invoke-virtual {v0, p1, v1, p2}, Lcom/google/crypto/tink/shaded/protobuf/m;->s0([BII)V

    return-void
.end method

.method public c(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k0;->a:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/m;

    const/4 v1, 0x4

    invoke-virtual {v0, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/m;->y0(II)V

    return-void
.end method

.method public d(II)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k0;->a:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/m;

    invoke-virtual {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/m;->t0(II)V

    return-void
.end method

.method public e(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k0;->a:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/m;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/m;->v0(IJ)V

    return-void
.end method

.method public f(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/a1;)V
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k0;->a:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/m;

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/a;

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/m;->y0(II)V

    iget-object v1, v0, Lcom/google/crypto/tink/shaded/protobuf/m;->b:Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-interface {p3, p2, v1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->h(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/k0;)V

    const/4 p2, 0x4

    invoke-virtual {v0, p1, p2}, Lcom/google/crypto/tink/shaded/protobuf/m;->y0(II)V

    return-void
.end method

.method public g(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k0;->a:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/m;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/m;->A0(IJ)V

    return-void
.end method

.method public h(ILjava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/a1;)V
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k0;->a:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/m;

    check-cast p2, Lcom/google/crypto/tink/shaded/protobuf/a;

    const/4 v1, 0x2

    invoke-virtual {v0, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/m;->y0(II)V

    invoke-virtual {p2, p3}, Lcom/google/crypto/tink/shaded/protobuf/a;->b(Lcom/google/crypto/tink/shaded/protobuf/a1;)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/m;->z0(I)V

    iget-object p1, v0, Lcom/google/crypto/tink/shaded/protobuf/m;->b:Lcom/google/crypto/tink/shaded/protobuf/k0;

    invoke-interface {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/a1;->h(Ljava/lang/Object;Lcom/google/crypto/tink/shaded/protobuf/k0;)V

    return-void
.end method

.method public i(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/k0;->a:Ljava/lang/Object;

    check-cast v0, Lcom/google/crypto/tink/shaded/protobuf/m;

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Lcom/google/crypto/tink/shaded/protobuf/m;->y0(II)V

    return-void
.end method
