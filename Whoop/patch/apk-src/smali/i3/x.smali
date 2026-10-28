.class public abstract Li3/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[Lj93/z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Li3/x;

    const-string v2, "testTagsAsResourceId"

    const-string v3, "getTestTagsAsResourceId(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const-string v3, "accessibilityClassName"

    const-string v5, "getAccessibilityClassName(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"

    invoke-static {v1, v3, v5, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lj93/z;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    aput-object v1, v2, v4

    sput-object v2, Li3/x;->a:[Lj93/z;

    sget-object v0, Li3/v;->a:Li3/y;

    return-void
.end method

.method public static final a(Li3/z;)V
    .locals 3

    sget-object v0, Li3/v;->a:Li3/y;

    sget-object v1, Li3/x;->a:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, p0, v1}, Li3/y;->a(Li3/z;Ljava/lang/Object;)V

    return-void
.end method
