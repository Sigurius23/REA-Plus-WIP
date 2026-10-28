.class public final Lpj/s;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# static fields
.field public static final w:Lpj/s;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpj/s;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Lpj/s;->w:Lpj/s;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Landroidx/compose/ui/Modifier;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    const-string p3, "$this$conditional"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const p1, -0x4b51e4bb

    invoke-virtual {p2, p1}, Lp1/q;->f0(I)V

    sget-wide v0, Li2/x;->b:J

    const p1, 0x3ecccccd    # 0.4f

    invoke-static {p1, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v0

    sget-object p1, Li2/w0;->a:Li2/v0;

    sget-object p3, Lb2/t;->w:Lb2/t;

    invoke-static {p3, v0, v1, p1}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lp1/q;->q(Z)V

    return-object p1
.end method
