.class public final synthetic Lt61/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lu61/b;

.field public final synthetic x:J

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Lu61/b;JFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt61/d;->w:Lu61/b;

    iput-wide p2, p0, Lt61/d;->x:J

    iput p4, p0, Lt61/d;->y:F

    iput p5, p0, Lt61/d;->z:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v4, p0, Lt61/d;->z:F

    move-object v5, p1

    check-cast v5, Lk2/e;

    iget-object v0, p0, Lt61/d;->w:Lu61/b;

    iget-wide v1, p0, Lt61/d;->x:J

    iget v3, p0, Lt61/d;->y:F

    invoke-static/range {v0 .. v5}, Lt61/f;->a(Lu61/b;JFFLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
