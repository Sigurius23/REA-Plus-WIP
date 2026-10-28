.class public final Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J#\u0010\u000c\u001a\u0004\u0018\u00010\u00042\u0008\u0010\t\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0013\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0012R\u001c\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\n \u0015*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;",
        "intent",
        "",
        "d",
        "(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;)Ljava/lang/String;",
        "raw",
        "Ltr2/n;",
        "logger",
        "b",
        "(Ljava/lang/String;Ltr2/n;)Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;",
        "Lwc3/c;",
        "serializer",
        "()Lwc3/c;",
        "Lad3/c;",
        "Lad3/c;",
        "json",
        "Ljava/util/Base64$Encoder;",
        "kotlin.jvm.PlatformType",
        "c",
        "Ljava/util/Base64$Encoder;",
        "encoder",
        "Ljava/util/Base64$Decoder;",
        "Ljava/util/Base64$Decoder;",
        "decoder",
        "universal-checkout_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic a:Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;

.field private static final b:Lad3/c;

.field private static final c:Ljava/util/Base64$Encoder;

.field private static final d:Ljava/util/Base64$Decoder;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;

    invoke-direct {v0}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;-><init>()V

    sput-object v0, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;->a:Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;

    new-instance v0, Lp;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lp;-><init>(I)V

    sget-object v1, Lad3/c;->d:Lad3/b;

    invoke-static {v1, v0}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object v0

    sput-object v0, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;->b:Lad3/c;

    invoke-static {}, Ljava/util/Base64;->getUrlEncoder()Ljava/util/Base64$Encoder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Base64$Encoder;->withoutPadding()Ljava/util/Base64$Encoder;

    move-result-object v0

    sput-object v0, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;->c:Ljava/util/Base64$Encoder;

    invoke-static {}, Ljava/util/Base64;->getUrlDecoder()Ljava/util/Base64$Decoder;

    move-result-object v0

    sput-object v0, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;->d:Ljava/util/Base64$Decoder;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lad3/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;->e(Lad3/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;Ljava/lang/String;Ltr2/n;ILjava/lang/Object;)Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "CartAddIntent"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;->b(Ljava/lang/String;Ltr2/n;)Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lad3/g;)Ll83/a0;
    .locals 1

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lad3/g;->c:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Ltr2/n;)Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;
    .locals 4

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;->d:Ljava/util/Base64$Decoder;

    invoke-virtual {v2, p1}, Ljava/util/Base64$Decoder;->decode(Ljava/lang/String;)[B

    move-result-object p1

    const-string v2, "decode(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lyb3/a;->a:Ljava/nio/charset/Charset;

    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, p1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    sget-object p1, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;->b:Lad3/c;

    sget-object v2, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;->a:Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;

    invoke-virtual {v2}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-virtual {p1, v2, v3}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    const-string v2, "Failed to base64-decode CartAddIntent"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p2, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_2

    :goto_1
    const-string v2, "Failed to deserialize CartAddIntent"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p2, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_1
    :goto_2
    return-object v0
.end method

.method public final d(Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;)Ljava/lang/String;
    .locals 2

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;->b:Lad3/c;

    sget-object v1, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;->a:Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;

    invoke-virtual {v1}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/j;

    invoke-virtual {v0, v1, p1}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;->c:Ljava/util/Base64$Encoder;

    sget-object v1, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string v1, "getBytes(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/util/Base64$Encoder;->encodeToString([B)Ljava/lang/String;

    move-result-object p1

    const-string v0, "encodeToString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final serializer()Lwc3/c;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    new-instance v0, Lwc3/g;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const-class v3, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Pack;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const-class v4, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Standalone;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const-class v5, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v5, 0x3

    move-object v6, v3

    new-array v3, v5, [Lj93/d;

    const/4 v7, 0x0

    aput-object v6, v3, v7

    const/4 v6, 0x1

    aput-object v4, v3, v6

    const/4 v4, 0x2

    aput-object v1, v3, v4

    new-array v1, v5, [Lwc3/c;

    sget-object v5, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Pack$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Pack$$serializer;

    aput-object v5, v1, v7

    sget-object v5, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Standalone$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Standalone$$serializer;

    aput-object v5, v1, v6

    sget-object v5, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw$$serializer;->INSTANCE:Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$Wyw$$serializer;

    aput-object v5, v1, v4

    new-array v5, v7, [Ljava/lang/annotation/Annotation;

    move-object v4, v1

    const-string v1, "com.whoop.universalcheckout.features.cart.domain.CartAddIntent"

    invoke-direct/range {v0 .. v5}, Lwc3/g;-><init>(Ljava/lang/String;Lj93/d;[Lj93/d;[Lwc3/c;[Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method
