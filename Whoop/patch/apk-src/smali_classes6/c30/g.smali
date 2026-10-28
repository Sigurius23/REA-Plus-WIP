.class public abstract Lc30/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[Lj93/z;

.field public static final b:Li3/y;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lc30/g;

    const-string v2, "testMetadata"

    const-string v3, "getTestMetadata(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    new-array v1, v4, [Lj93/z;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lc30/g;->a:[Lj93/z;

    new-instance v0, Li3/y;

    new-instance v1, Ln;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Ln;-><init>(I)V

    const-string v2, "TestMetadata"

    invoke-direct {v0, v2, v1}, Li3/y;-><init>(Ljava/lang/String;Lc93/m;)V

    sput-object v0, Lc30/g;->b:Li3/y;

    return-void
.end method
