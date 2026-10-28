.class public final Lrb3/m;
.super Lrb3/n;
.source "SourceFile"


# static fields
.field public static final d:Lrb3/m;

.field public static final e:Lrb3/m;


# instance fields
.field public final synthetic c:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lrb3/m;

    const-string v1, "must be a member function"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lrb3/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrb3/m;->d:Lrb3/m;

    new-instance v0, Lrb3/m;

    const-string v1, "must be a member or an extension function"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lrb3/m;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lrb3/m;->e:Lrb3/m;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Lrb3/m;->c:I

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lrb3/n;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lha3/e;)Z
    .locals 1

    iget v0, p0, Lrb3/m;->c:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p1, Lu93/x;->K:Lr93/q0;

    if-nez v0, :cond_1

    iget-object p1, p1, Lu93/x;->J:Lr93/q0;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1

    :pswitch_0
    iget-object p1, p1, Lu93/x;->K:Lr93/q0;

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
