.class public final Le63/f;
.super Lr63/d;
.source "SourceFile"


# static fields
.field public static final g:Lhc3/x;

.field public static final h:Lhc3/x;

.field public static final i:Lhc3/x;

.field public static final j:Lhc3/x;

.field public static final k:Lhc3/x;

.field public static final l:Lhc3/x;

.field public static final m:Lhc3/x;

.field public static final n:Lhc3/x;

.field public static final o:Lhc3/x;

.field public static final p:Lhc3/x;


# instance fields
.field public final synthetic e:I

.field public final f:Z


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lhc3/x;

    const-string v1, "Before"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le63/f;->g:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "State"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le63/f;->h:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "Transform"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le63/f;->i:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "Render"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le63/f;->j:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "Send"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le63/f;->k:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "Before"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le63/f;->l:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "State"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le63/f;->m:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "Monitoring"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le63/f;->n:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "Engine"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le63/f;->o:Lhc3/x;

    new-instance v0, Lhc3/x;

    const-string v1, "Receive"

    invoke-direct {v0, v1, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le63/f;->p:Lhc3/x;

    return-void
.end method

.method public constructor <init>(ZI)V
    .locals 4

    iput p2, p0, Le63/f;->e:I

    packed-switch p2, :pswitch_data_0

    sget-object p2, Le63/f;->j:Lhc3/x;

    sget-object v0, Le63/f;->k:Lhc3/x;

    sget-object v1, Le63/f;->g:Lhc3/x;

    sget-object v2, Le63/f;->h:Lhc3/x;

    sget-object v3, Le63/f;->i:Lhc3/x;

    filled-new-array {v1, v2, v3, p2, v0}, [Lhc3/x;

    move-result-object p2

    invoke-direct {p0, p2}, Lr63/d;-><init>([Lhc3/x;)V

    iput-boolean p1, p0, Le63/f;->f:Z

    return-void

    :pswitch_0
    sget-object p2, Le63/f;->o:Lhc3/x;

    sget-object v0, Le63/f;->p:Lhc3/x;

    sget-object v1, Le63/f;->l:Lhc3/x;

    sget-object v2, Le63/f;->m:Lhc3/x;

    sget-object v3, Le63/f;->n:Lhc3/x;

    filled-new-array {v1, v2, v3, p2, v0}, [Lhc3/x;

    move-result-object p2

    invoke-direct {p0, p2}, Lr63/d;-><init>([Lhc3/x;)V

    iput-boolean p1, p0, Le63/f;->f:Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final d()Z
    .locals 1

    iget v0, p0, Le63/f;->e:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Le63/f;->f:Z

    return v0

    :pswitch_0
    iget-boolean v0, p0, Le63/f;->f:Z

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
