.class public final Lg40/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# static fields
.field public static final w:Lg40/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg40/g0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lg40/g0;->w:Lg40/g0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v3, p1

    check-cast v3, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    and-int/lit8 p1, p1, 0x3

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    move-object p1, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, Lg40/q3;

    const/4 p1, 0x0

    const/16 p2, 0xa

    const v1, 0x7f0807c2

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, p1, p2}, Lg40/q3;-><init>(IZLh02/n0;I)V

    const/16 p1, 0x8

    int-to-float p1, p1

    sget-object p2, Lb2/t;->w:Lb2/t;

    invoke-static {p1, p2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v4, 0x1b0

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lg40/j4;->h(Lg40/q3;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
