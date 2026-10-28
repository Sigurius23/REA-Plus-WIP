.class public final Le4/d;
.super Lf93/b;
.source "SourceFile"


# instance fields
.field public final w:Ljava/lang/String;

.field public final synthetic x:Le4/e;


# direct methods
.method public constructor <init>(Le4/e;FLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Le4/d;->x:Le4/e;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-direct {p0, p1}, Lf93/b;-><init>(Ljava/lang/Object;)V

    iput-object p3, p0, Le4/d;->w:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final afterChange(Lj93/z;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    move-result p3

    if-nez p3, :cond_1

    iget-object p3, p0, Le4/d;->x:Le4/e;

    iget-object p3, p3, Le4/e;->b:Li4/g;

    iget-object v0, p0, Le4/d;->w:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-interface {p1}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object v0

    :cond_0
    new-instance p1, Li4/e;

    invoke-direct {p1, p2}, Li4/e;-><init>(F)V

    invoke-virtual {p3, v0, p1}, Li4/b;->B(Ljava/lang/String;Li4/c;)V

    :cond_1
    return-void
.end method
