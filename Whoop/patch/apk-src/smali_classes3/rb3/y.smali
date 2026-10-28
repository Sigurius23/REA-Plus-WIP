.class public final Lrb3/y;
.super Lrb3/n;
.source "SourceFile"


# static fields
.field public static final d:Lrb3/y;

.field public static final e:Lrb3/y;


# instance fields
.field public final synthetic c:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lrb3/y;

    const-string v1, "must have no value parameters"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lrb3/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrb3/y;->d:Lrb3/y;

    new-instance v0, Lrb3/y;

    const-string v1, "must have a single value parameter"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lrb3/y;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrb3/y;->e:Lrb3/y;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Lrb3/y;->c:I

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lrb3/n;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lha3/e;)Z
    .locals 1

    iget v0, p0, Lrb3/y;->c:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Lu93/x;->v()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_0
    invoke-virtual {p1}, Lu93/x;->v()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
