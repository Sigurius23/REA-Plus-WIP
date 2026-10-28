.class public final synthetic Lf61/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Lg61/c;

.field public final synthetic G:Lf61/i;

.field public final synthetic H:J

.field public final synthetic I:F

.field public final synthetic J:Z

.field public final synthetic w:Z

.field public final synthetic x:Lkotlin/jvm/internal/g0;

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(ZLkotlin/jvm/internal/g0;FFZLg61/c;Lf61/i;JFZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lf61/g;->w:Z

    iput-object p2, p0, Lf61/g;->x:Lkotlin/jvm/internal/g0;

    iput p3, p0, Lf61/g;->y:F

    iput p4, p0, Lf61/g;->z:F

    iput-boolean p5, p0, Lf61/g;->E:Z

    iput-object p6, p0, Lf61/g;->F:Lg61/c;

    iput-object p7, p0, Lf61/g;->G:Lf61/i;

    iput-wide p8, p0, Lf61/g;->H:J

    iput p10, p0, Lf61/g;->I:F

    iput-boolean p11, p0, Lf61/g;->J:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-boolean v10, p0, Lf61/g;->J:Z

    move-object v11, p1

    check-cast v11, Lk2/e;

    iget-boolean v0, p0, Lf61/g;->w:Z

    iget-object v1, p0, Lf61/g;->x:Lkotlin/jvm/internal/g0;

    iget v2, p0, Lf61/g;->y:F

    iget v3, p0, Lf61/g;->z:F

    iget-boolean v4, p0, Lf61/g;->E:Z

    iget-object v5, p0, Lf61/g;->F:Lg61/c;

    iget-object v6, p0, Lf61/g;->G:Lf61/i;

    iget-wide v7, p0, Lf61/g;->H:J

    iget v9, p0, Lf61/g;->I:F

    invoke-static/range {v0 .. v11}, Lf61/i;->g(ZLkotlin/jvm/internal/g0;FFZLg61/c;Lf61/i;JFZLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
