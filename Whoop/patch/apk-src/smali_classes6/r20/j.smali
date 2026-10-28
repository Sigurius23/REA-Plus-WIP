.class public final Lr20/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr20/s;


# static fields
.field public static final E:F

.field public static final w:Lr20/j;

.field public static final x:Lec3/r1;

.field public static final y:F

.field public static final z:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lr20/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lr20/j;->w:Lr20/j;

    new-instance v0, Lr20/b;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lr20/b;-><init>(ZLr20/a;)V

    invoke-static {v0}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v0

    sput-object v0, Lr20/j;->x:Lec3/r1;

    int-to-float v0, v2

    sput v0, Lr20/j;->y:F

    sput v0, Lr20/j;->z:F

    sget v0, Lr20/t;->b:F

    sput v0, Lr20/j;->E:F

    return-void
.end method


# virtual methods
.method public final J(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V
    .locals 2

    const-string v0, "modifier"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const v0, 0x6b3a42c2

    invoke-virtual {p1, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-static {p2, v0, p1, v1}, Lds/q;->a(Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    return-void
.end method

.method public final T()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final a0(ZZ)Lec3/f2;
    .locals 0

    const/4 p1, 0x0

    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lec3/r1;
    .locals 1

    sget-object v0, Lr20/j;->x:Lec3/r1;

    return-object v0
.end method

.method public final b0(Z)Lec3/f2;
    .locals 0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    return-object p1
.end method

.method public final h()Lr20/h;
    .locals 1

    sget-object v0, Lr20/h;->x:Lr20/h;

    return-object v0
.end method

.method public final i()F
    .locals 1

    sget v0, Lr20/j;->z:F

    return v0
.end method

.method public final k()Lec3/f2;
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lbi/g;->Z(Ljava/lang/Object;)Lec3/r1;

    move-result-object v0

    return-object v0
.end method

.method public final m()F
    .locals 1

    sget v0, Lr20/j;->y:F

    return v0
.end method

.method public final s()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final x()F
    .locals 1

    sget v0, Lr20/j;->E:F

    return v0
.end method
