.class public final Leb/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Z

.field public f:Z

.field public g:I

.field public h:I

.field public i:I

.field public j:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Leb/w0;->c:I

    iput v0, p0, Leb/w0;->g:I

    iput v0, p0, Leb/w0;->h:I

    iput v0, p0, Leb/w0;->i:I

    iput v0, p0, Leb/w0;->j:I

    return-void
.end method

.method public static b(Leb/w0;IZ)V
    .locals 0

    iput p1, p0, Leb/w0;->c:I

    const/4 p1, 0x0

    iput-object p1, p0, Leb/w0;->d:Ljava/lang/String;

    iput-boolean p2, p0, Leb/w0;->e:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Leb/w0;->f:Z

    return-void
.end method


# virtual methods
.method public final a()Leb/x0;
    .locals 12

    iget-object v0, p0, Leb/w0;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v1, Leb/x0;

    iget-boolean v2, p0, Leb/w0;->a:Z

    iget-boolean v3, p0, Leb/w0;->b:Z

    iget-boolean v5, p0, Leb/w0;->e:Z

    iget-boolean v6, p0, Leb/w0;->f:Z

    iget v7, p0, Leb/w0;->g:I

    iget v8, p0, Leb/w0;->h:I

    iget v9, p0, Leb/w0;->i:I

    iget v10, p0, Leb/w0;->j:I

    sget v4, Leb/n0;->K:I

    const-string v4, "android-app://androidx.navigation/"

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    invoke-direct/range {v1 .. v10}, Leb/x0;-><init>(ZZIZZIIII)V

    iput-object v0, v1, Leb/x0;->j:Ljava/lang/String;

    return-object v1

    :cond_0
    new-instance v2, Leb/x0;

    iget-boolean v3, p0, Leb/w0;->a:Z

    iget-boolean v4, p0, Leb/w0;->b:Z

    iget v5, p0, Leb/w0;->c:I

    iget-boolean v6, p0, Leb/w0;->e:Z

    iget-boolean v7, p0, Leb/w0;->f:Z

    iget v8, p0, Leb/w0;->g:I

    iget v9, p0, Leb/w0;->h:I

    iget v10, p0, Leb/w0;->i:I

    iget v11, p0, Leb/w0;->j:I

    invoke-direct/range {v2 .. v11}, Leb/x0;-><init>(ZZIZZIIII)V

    return-object v2
.end method
