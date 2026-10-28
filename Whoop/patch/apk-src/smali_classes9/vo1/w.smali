.class public final synthetic Lvo1/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:F

.field public final synthetic w:J

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(JFFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lvo1/w;->w:J

    iput p3, p0, Lvo1/w;->x:F

    iput p4, p0, Lvo1/w;->y:F

    iput p5, p0, Lvo1/w;->z:F

    iput p6, p0, Lvo1/w;->E:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v5, p0, Lvo1/w;->E:F

    move-object v6, p1

    check-cast v6, Lk2/e;

    iget-wide v0, p0, Lvo1/w;->w:J

    iget v2, p0, Lvo1/w;->x:F

    iget v3, p0, Lvo1/w;->y:F

    iget v4, p0, Lvo1/w;->z:F

    invoke-static/range {v0 .. v6}, Lvo1/x;->f(JFFFFLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
