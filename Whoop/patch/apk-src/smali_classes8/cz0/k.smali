.class public final synthetic Lcz0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lcz0/q;

.field public final synthetic x:J

.field public final synthetic y:F

.field public final synthetic z:Li2/k;


# direct methods
.method public synthetic constructor <init>(Lcz0/q;JFLi2/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcz0/k;->w:Lcz0/q;

    iput-wide p2, p0, Lcz0/k;->x:J

    iput p4, p0, Lcz0/k;->y:F

    iput-object p5, p0, Lcz0/k;->z:Li2/k;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v4, p0, Lcz0/k;->z:Li2/k;

    move-object v5, p1

    check-cast v5, Lk2/e;

    iget-object v0, p0, Lcz0/k;->w:Lcz0/q;

    iget-wide v1, p0, Lcz0/k;->x:J

    iget v3, p0, Lcz0/k;->y:F

    invoke-static/range {v0 .. v5}, Lcz0/o;->b(Lcz0/q;JFLi2/k;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
