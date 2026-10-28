.class public final Lah/j;
.super Lah/k;
.source "SourceFile"


# static fields
.field public static final g:Lah/j;

.field public static final h:Lah/j;

.field public static final i:Lah/j;

.field public static final j:Lah/j;


# instance fields
.field public final e:I

.field public final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lah/j;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lah/j;-><init>(ILe4/p;)V

    sput-object v0, Lah/j;->g:Lah/j;

    new-instance v0, Lah/j;

    const/4 v1, 0x2

    invoke-direct {v0, v1, v2}, Lah/j;-><init>(ILe4/p;)V

    sput-object v0, Lah/j;->h:Lah/j;

    new-instance v0, Lah/j;

    const/4 v1, 0x3

    invoke-direct {v0, v1, v2}, Lah/j;-><init>(ILe4/p;)V

    sput-object v0, Lah/j;->i:Lah/j;

    new-instance v0, Lah/j;

    const/4 v1, 0x4

    invoke-direct {v0, v1, v2}, Lah/j;-><init>(ILe4/p;)V

    sput-object v0, Lah/j;->j:Lah/j;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/16 v0, 0x17

    if-gt p1, v0, :cond_0

    .line 5
    sget-object v0, Lah/l;->w:Lah/l;

    goto :goto_0

    :cond_0
    sget-object v0, Lah/l;->x:Lah/l;

    :goto_0
    invoke-direct {p0, v0}, Lah/k;-><init>(Lah/l;)V

    .line 6
    iput p1, p0, Lah/j;->f:I

    and-int/lit8 p1, p1, 0x1f

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x6

    goto :goto_1

    :pswitch_0
    const/4 p1, 0x5

    goto :goto_1

    :pswitch_1
    const/4 p1, 0x4

    goto :goto_1

    :pswitch_2
    const/4 p1, 0x3

    goto :goto_1

    :pswitch_3
    const/4 p1, 0x2

    goto :goto_1

    :pswitch_4
    const/4 p1, 0x1

    .line 7
    :goto_1
    iput p1, p0, Lah/j;->e:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(ILe4/p;)V
    .locals 0

    .line 1
    sget-object p2, Lah/l;->w:Lah/l;

    invoke-direct {p0, p2}, Lah/k;-><init>(Lah/l;)V

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    .line 2
    throw p1

    :pswitch_0
    const/16 p2, 0x17

    goto :goto_0

    :pswitch_1
    const/16 p2, 0x16

    goto :goto_0

    :pswitch_2
    const/16 p2, 0x15

    goto :goto_0

    :pswitch_3
    const/16 p2, 0x14

    .line 3
    :goto_0
    :pswitch_4
    iput p2, p0, Lah/j;->f:I

    .line 4
    iput p1, p0, Lah/j;->e:I

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lah/j;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lah/j;

    invoke-super {p0, p1}, Lah/k;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget p1, p0, Lah/j;->f:I

    iget v0, v0, Lah/j;->f:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    invoke-super {p0}, Lah/k;->hashCode()I

    move-result v0

    iget v1, p0, Lah/j;->f:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lah/j;->e:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    throw v0

    :pswitch_0
    const-string v0, "UNALLOCATED"

    goto :goto_0

    :pswitch_1
    const-string v0, "RESERVED"

    goto :goto_0

    :pswitch_2
    const-string v0, "UNDEFINED"

    goto :goto_0

    :pswitch_3
    const-string v0, "NULL"

    goto :goto_0

    :pswitch_4
    const-string v0, "TRUE"

    goto :goto_0

    :pswitch_5
    const-string v0, "FALSE"

    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
