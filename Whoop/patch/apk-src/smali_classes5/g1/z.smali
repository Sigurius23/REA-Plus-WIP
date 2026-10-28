.class public final Lg1/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/n1;


# instance fields
.field public final synthetic a:I

.field public final b:Lh0/g1;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lg1/a0;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lg1/z;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lg1/z;->c:Ljava/lang/Object;

    .line 6
    new-instance v0, Lg1/y;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lg1/y;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lg1/z;->b:Lh0/g1;

    return-void
.end method

.method public constructor <init>(Lm1/g;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lg1/z;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lg1/z;->c:Ljava/lang/Object;

    .line 3
    new-instance v0, Lg1/y;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lg1/y;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lg1/z;->b:Lh0/g1;

    return-void
.end method


# virtual methods
.method public final a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lg1/z;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg1/z;->c:Ljava/lang/Object;

    check-cast v0, Lm1/g;

    new-instance v1, Lg1/x;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, p0, p2, v2, v3}, Lg1/x;-><init>(Lg1/z;Lc93/m;Lq83/d;B)V

    invoke-virtual {v0, p1, v1, p3}, Lm1/g;->a(Lf0/z0;Lg1/x;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_0
    return-object p1

    :pswitch_0
    iget-object v0, p0, Lg1/z;->c:Ljava/lang/Object;

    check-cast v0, Lg1/a0;

    new-instance v1, Lg1/x;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p2, v2}, Lg1/x;-><init>(Lg1/z;Lc93/m;Lq83/d;)V

    invoke-virtual {v0, p1, v1, p3}, Lg1/a0;->a(Lf0/z0;Lg1/x;Lq83/d;)Ljava/lang/Object;

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
