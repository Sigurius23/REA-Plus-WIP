.class public final Lp43/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[Lj93/z;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lkotlin/jvm/internal/z;

    const-string v1, "dataStore"

    const-string v2, "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"

    const-class v3, Lp43/b;

    invoke-direct {v0, v3, v1, v2}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->property2(Lkotlin/jvm/internal/y;)Lj93/y;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lp43/b;->a:[Lj93/z;

    return-void
.end method
