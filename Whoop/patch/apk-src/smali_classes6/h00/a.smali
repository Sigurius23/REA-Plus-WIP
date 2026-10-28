.class public final Lh00/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# static fields
.field public static final w:Lh00/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh00/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lh00/a;->w:Lh00/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lc0/o;

    check-cast p2, Leb/q;

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    const-string p4, "$this$composable"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 p2, 0x3

    const/4 p4, 0x0

    invoke-static {p4, p4, p3, p1, p2}, Lug/m;->b(Landroidx/compose/ui/Modifier;Ly3/f;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
