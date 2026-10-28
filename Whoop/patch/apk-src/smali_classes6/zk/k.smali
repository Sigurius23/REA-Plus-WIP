.class public final Lzk/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lzk/k;

.field public static final c:Lzk/k;

.field public static final d:Lzk/k;

.field public static final e:Lzk/k;


# instance fields
.field public final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzk/k;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzk/k;-><init>(I)V

    sput-object v0, Lzk/k;->b:Lzk/k;

    new-instance v0, Lzk/k;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lzk/k;-><init>(I)V

    sput-object v0, Lzk/k;->c:Lzk/k;

    new-instance v0, Lzk/k;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lzk/k;-><init>(I)V

    sput-object v0, Lzk/k;->d:Lzk/k;

    new-instance v0, Lzk/k;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lzk/k;-><init>(I)V

    sput-object v0, Lzk/k;->e:Lzk/k;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lzk/k;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lwk/a;)Z
    .locals 1

    iget v0, p0, Lzk/k;->a:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lwk/a;->x:Lwk/a;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :pswitch_0
    sget-object v0, Lwk/a;->y:Lwk/a;

    if-eq p1, v0, :cond_1

    sget-object v0, Lwk/a;->E:Lwk/a;

    if-eq p1, v0, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1

    :pswitch_1
    const/4 p1, 0x0

    return p1

    :pswitch_2
    sget-object v0, Lwk/a;->x:Lwk/a;

    if-ne p1, v0, :cond_2

    const/4 p1, 0x1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
