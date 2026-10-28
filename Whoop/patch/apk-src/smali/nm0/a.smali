.class public final Lnm0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J;\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u000c0\u0007\"\u0004\u0008\u0000\u0010\u00062\u0012\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u00080\u00072\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lnm0/a;",
        "",
        "Lu02/c;",
        "apiClient",
        "<init>",
        "(Lu02/c;)V",
        "RequestBodyT",
        "Lec3/l;",
        "Lz02/a;",
        "requestFlow",
        "Ls63/a;",
        "requestBodyTypeInfo",
        "Lu02/g;",
        "Lne3/l;",
        "a",
        "(Lec3/l;Ls63/a;)Lec3/l;",
        "Lu02/c;",
        "cache_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lu02/c;


# direct methods
.method public constructor <init>(Lu02/c;)V
    .locals 1

    const-string v0, "apiClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnm0/a;->a:Lu02/c;

    return-void
.end method


# virtual methods
.method public final a(Lec3/l;Ls63/a;)Lec3/l;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RequestBodyT:",
            "Ljava/lang/Object;",
            ">(",
            "Lec3/l;",
            "Ls63/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "requestFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestBodyTypeInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnm0/a;->a:Lu02/c;

    const-class v1, Lne3/l;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v2

    invoke-static {v2}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v3

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-static {v1, v2, v3}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v1

    invoke-static {p1, v0, p2, v1}, Lu02/f;->b(Lec3/l;Lu02/c;Ls63/a;Ls63/a;)Lec3/l;

    move-result-object p1

    return-object p1
.end method
