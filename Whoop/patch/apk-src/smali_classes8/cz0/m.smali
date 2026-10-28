.class public final synthetic Lcz0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(JLj61/c;FF)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lcz0/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcz0/m;->x:J

    iput-object p3, p0, Lcz0/m;->E:Ljava/lang/Object;

    iput p4, p0, Lcz0/m;->y:F

    iput p5, p0, Lcz0/m;->z:F

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;JFF)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lcz0/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcz0/m;->E:Ljava/lang/Object;

    iput-wide p2, p0, Lcz0/m;->x:J

    iput p4, p0, Lcz0/m;->y:F

    iput p5, p0, Lcz0/m;->z:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lcz0/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcz0/m;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lj61/c;

    iget v5, p0, Lcz0/m;->z:F

    move-object v6, p1

    check-cast v6, Lk2/e;

    iget-wide v1, p0, Lcz0/m;->x:J

    iget v4, p0, Lcz0/m;->y:F

    invoke-static/range {v1 .. v6}, Le61/m;->c(JLj61/c;FFLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcz0/m;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget v5, p0, Lcz0/m;->z:F

    move-object v6, p1

    check-cast v6, Lk2/e;

    iget-wide v2, p0, Lcz0/m;->x:J

    iget v4, p0, Lcz0/m;->y:F

    invoke-static/range {v1 .. v6}, Lcz0/o;->a(Ljava/util/List;JFFLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
