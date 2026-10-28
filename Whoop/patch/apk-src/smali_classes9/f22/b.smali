.class public final synthetic Lf22/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg22/d;

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lg22/d;Ljava/lang/String;I)V
    .locals 0

    iput p3, p0, Lf22/b;->w:I

    iput-object p1, p0, Lf22/b;->x:Lg22/d;

    iput-object p2, p0, Lf22/b;->y:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lf22/b;->w:I

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/util/Map;

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf22/b;->x:Lg22/d;

    iget-object v1, p0, Lf22/b;->y:Ljava/lang/String;

    invoke-static {v0, v1, p1, p2}, Lf22/c;->d(Lg22/d;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lf22/b;->x:Lg22/d;

    iget-object v1, p0, Lf22/b;->y:Ljava/lang/String;

    invoke-static {v0, v1, p1, p2}, Lf22/c;->f(Lg22/d;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
