.class public abstract Lu82/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001d\u0010\u0007\u001a\u00020\u00008\u0006\u00a2\u0006\u0012\n\u0004\u0008\u0001\u0010\u0002\u0012\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0003\u0010\u0004\"\u0017\u0010\r\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lad3/c;",
        "a",
        "Lad3/c;",
        "c",
        "()Lad3/c;",
        "getBaseWhoopKtxSerializationJson$annotations",
        "()V",
        "baseWhoopKtxSerializationJson",
        "Lpg3/m;",
        "b",
        "Lpg3/m;",
        "d",
        "()Lpg3/m;",
        "defaultConverterFactory",
        "serialization_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lad3/c;

.field private static final b:Lpg3/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lto1/h;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lto1/h;-><init>(I)V

    sget-object v1, Lad3/c;->d:Lad3/b;

    invoke-static {v1, v0}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object v0

    sput-object v0, Lu82/k;->a:Lad3/c;

    invoke-static {v0}, Lu82/f;->a(Lad3/c;)Lpg3/m;

    move-result-object v0

    sput-object v0, Lu82/k;->b:Lpg3/m;

    return-void
.end method

.method public static synthetic a(Lad3/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lu82/k;->b(Lad3/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lad3/g;)Ll83/a0;
    .locals 2

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lad3/g;->a:Z

    sget-object v1, Lad3/w;->a:Lad3/v;

    iput-object v1, p0, Lad3/g;->k:Lad3/v;

    iput-boolean v0, p0, Lad3/g;->c:Z

    iput-boolean v0, p0, Lad3/g;->l:Z

    iput-boolean v0, p0, Lad3/g;->g:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lad3/g;->b:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final c()Lad3/c;
    .locals 1

    sget-object v0, Lu82/k;->a:Lad3/c;

    return-object v0
.end method

.method public static final d()Lpg3/m;
    .locals 1

    sget-object v0, Lu82/k;->b:Lpg3/m;

    return-object v0
.end method
