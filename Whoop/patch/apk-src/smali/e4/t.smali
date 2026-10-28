.class public abstract Le4/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[Lj93/z;

.field public static final b:Li3/y;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Le4/t;

    const-string v2, "designInfoProvider"

    const-string v3, "getDesignInfoProvider(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    new-array v1, v4, [Lj93/z;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Le4/t;->a:[Lj93/z;

    new-instance v0, Li3/y;

    const-string v1, "DesignInfoProvider"

    invoke-direct {v0, v1}, Li3/y;-><init>(Ljava/lang/String;)V

    sput-object v0, Le4/t;->b:Li3/y;

    return-void
.end method

.method public static final a(Li3/z;Le4/r;)V
    .locals 2

    sget-object v0, Le4/t;->a:[Lj93/z;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    sget-object v0, Le4/t;->b:Li3/y;

    invoke-virtual {v0, p0, p1}, Li3/y;->a(Li3/z;Ljava/lang/Object;)V

    return-void
.end method
