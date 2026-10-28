.class public final synthetic Lo61/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:F

.field public final synthetic G:J

.field public final synthetic H:F

.field public final synthetic I:J

.field public final synthetic J:F

.field public final synthetic w:Lj71/b$e;

.field public final synthetic x:J

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Lj71/b$e;JFFFFJFJF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo61/c;->w:Lj71/b$e;

    iput-wide p2, p0, Lo61/c;->x:J

    iput p4, p0, Lo61/c;->y:F

    iput p5, p0, Lo61/c;->z:F

    iput p6, p0, Lo61/c;->E:F

    iput p7, p0, Lo61/c;->F:F

    iput-wide p8, p0, Lo61/c;->G:J

    iput p10, p0, Lo61/c;->H:F

    iput-wide p11, p0, Lo61/c;->I:J

    iput p13, p0, Lo61/c;->J:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget v12, p0, Lo61/c;->J:F

    move-object v13, p1

    check-cast v13, Lk2/e;

    iget-object v0, p0, Lo61/c;->w:Lj71/b$e;

    iget-wide v1, p0, Lo61/c;->x:J

    iget v3, p0, Lo61/c;->y:F

    iget v4, p0, Lo61/c;->z:F

    iget v5, p0, Lo61/c;->E:F

    iget v6, p0, Lo61/c;->F:F

    iget-wide v7, p0, Lo61/c;->G:J

    iget v9, p0, Lo61/c;->H:F

    iget-wide v10, p0, Lo61/c;->I:J

    invoke-static/range {v0 .. v13}, Lo61/d;->a(Lj71/b$e;JFFFFJFJFLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
