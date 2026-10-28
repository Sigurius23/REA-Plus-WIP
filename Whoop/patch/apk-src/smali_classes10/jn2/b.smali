.class public final synthetic Ljn2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lp1/t2;

.field public final synthetic w:J

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(JFFFLp1/t2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ljn2/b;->w:J

    iput p3, p0, Ljn2/b;->x:F

    iput p4, p0, Ljn2/b;->y:F

    iput p5, p0, Ljn2/b;->z:F

    iput-object p6, p0, Ljn2/b;->E:Lp1/t2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v5, p0, Ljn2/b;->E:Lp1/t2;

    move-object v6, p1

    check-cast v6, Lk2/c;

    iget-wide v0, p0, Ljn2/b;->w:J

    iget v2, p0, Ljn2/b;->x:F

    iget v3, p0, Ljn2/b;->y:F

    iget v4, p0, Ljn2/b;->z:F

    invoke-static/range {v0 .. v6}, Ljn2/c;->c(JFFFLp1/t2;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
