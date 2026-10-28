.class public final Lj53/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lj53/m;


# direct methods
.method public synthetic constructor <init>(Lj53/m;I)V
    .locals 0

    iput p2, p0, Lj53/i;->w:I

    iput-object p1, p0, Lj53/i;->x:Lj53/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lj53/i;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lio/getstream/android/video/generated/models/VideoEvent;

    new-instance p1, Lj53/k;

    iget-object v0, p0, Lj53/i;->x:Lj53/m;

    iget-object v1, v0, Lj53/m;->b:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    iget-object v2, v0, Lj53/m;->c:Lec3/r1;

    iget-object v2, v2, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    iget-object v3, v0, Lj53/m;->e:Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj53/f;

    iget-object v4, v0, Lj53/m;->f:Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Comparator;

    invoke-direct {p1, v1, v2, v3, v4}, Lj53/k;-><init>(Ljava/util/Map;Ljava/util/Map;Lj53/f;Ljava/util/Comparator;)V

    invoke-static {v0, p1, p2}, Lj53/m;->a(Lj53/m;Lj53/k;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_0
    return-object p1

    :pswitch_0
    check-cast p1, Lj53/k;

    iget-object v0, p0, Lj53/i;->x:Lj53/m;

    invoke-static {v0, p1, p2}, Lj53/m;->a(Lj53/m;Lj53/k;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    goto :goto_1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
