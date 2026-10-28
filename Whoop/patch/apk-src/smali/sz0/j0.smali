.class public final synthetic Lsz0/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:J

.field public final synthetic x:Ld0/e;

.field public final synthetic y:F


# direct methods
.method public synthetic constructor <init>(JLd0/e;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lsz0/j0;->w:J

    iput-object p3, p0, Lsz0/j0;->x:Ld0/e;

    iput p4, p0, Lsz0/j0;->y:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lsz0/j0;->y:F

    check-cast p1, Lk2/e;

    iget-wide v1, p0, Lsz0/j0;->w:J

    iget-object v3, p0, Lsz0/j0;->x:Ld0/e;

    invoke-static {v1, v2, v3, v0, p1}, Lsz0/m0;->k(JLd0/e;FLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
