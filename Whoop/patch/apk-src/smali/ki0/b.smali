.class public abstract Lki0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "Lad3/c;",
        "a",
        "Lad3/c;",
        "appConfigurationJson",
        "app-configuration_release"
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


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object v0

    new-instance v1, Lkg2/e;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lkg2/e;-><init>(I)V

    invoke-static {v0, v1}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object v0

    sput-object v0, Lki0/b;->a:Lad3/c;

    return-void
.end method

.method public static synthetic a(Lad3/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lki0/b;->c(Lad3/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()Lad3/c;
    .locals 1

    sget-object v0, Lki0/b;->a:Lad3/c;

    return-object v0
.end method

.method private static final c(Lad3/g;)Ll83/a0;
    .locals 5

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcd3/g;

    invoke-direct {v0}, Lcd3/g;-><init>()V

    const-class v1, Lcom/whoop/navigation/e;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lcom/whoop/navigation/json/a;

    const/4 v3, 0x0

    const/4 v4, 0x3

    invoke-direct {v2, v3, v3, v4, v3}, Lcom/whoop/navigation/json/a;-><init>(Ljava/util/Map;Liy1/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1, v2}, Lcd3/g;->k(Lj93/d;Lwc3/c;)V

    invoke-virtual {v0}, Lcd3/g;->r()Lcd3/d;

    move-result-object v0

    iput-object v0, p0, Lad3/g;->o:Lcd3/f;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
