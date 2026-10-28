.class public final Lp6/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[Lj93/z;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkotlin/jvm/internal/z;

    const-string v1, "appManagerDataStore"

    const-string v2, "getAppManagerDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    const-class v3, Lp6/j0;

    invoke-direct {v0, v3, v1, v2}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->property2(Lkotlin/jvm/internal/y;)Lj93/y;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lp6/j0;->a:[Lj93/z;

    return-void
.end method

.method public static final a(Lp6/j0;Ljava/lang/String;)Lf6/d;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Ljava/lang/StringBuilder;

    const-string v0, "provider:"

    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object p0

    return-object p0
.end method
