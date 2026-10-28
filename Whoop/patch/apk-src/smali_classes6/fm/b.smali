.class public final Lfm/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llt/c;


# static fields
.field public static final a:Lfm/b;

.field public static final b:Llt/b;

.field public static final c:Llt/b;

.field public static final d:Llt/b;

.field public static final e:Llt/b;

.field public static final f:Llt/b;

.field public static final g:Llt/b;

.field public static final h:Llt/b;

.field public static final i:Llt/b;

.field public static final j:Llt/b;

.field public static final k:Llt/b;

.field public static final l:Llt/b;

.field public static final m:Llt/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfm/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lfm/b;->a:Lfm/b;

    const-string v0, "sdkVersion"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/b;->b:Llt/b;

    const-string v0, "model"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/b;->c:Llt/b;

    const-string v0, "hardware"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/b;->d:Llt/b;

    const-string v0, "device"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/b;->e:Llt/b;

    const-string v0, "product"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/b;->f:Llt/b;

    const-string v0, "osBuild"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/b;->g:Llt/b;

    const-string v0, "manufacturer"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/b;->h:Llt/b;

    const-string v0, "fingerprint"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/b;->i:Llt/b;

    const-string v0, "locale"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/b;->j:Llt/b;

    const-string v0, "country"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/b;->k:Llt/b;

    const-string v0, "mccMnc"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/b;->l:Llt/b;

    const-string v0, "applicationBuild"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/b;->m:Llt/b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lfm/a;

    check-cast p2, Llt/d;

    check-cast p1, Lfm/h;

    iget-object v0, p1, Lfm/h;->a:Ljava/lang/Integer;

    sget-object v1, Lfm/b;->b:Llt/b;

    invoke-interface {p2, v1, v0}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    sget-object v0, Lfm/b;->c:Llt/b;

    iget-object v1, p1, Lfm/h;->b:Ljava/lang/String;

    invoke-interface {p2, v0, v1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    sget-object v0, Lfm/b;->d:Llt/b;

    iget-object v1, p1, Lfm/h;->c:Ljava/lang/String;

    invoke-interface {p2, v0, v1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    sget-object v0, Lfm/b;->e:Llt/b;

    iget-object v1, p1, Lfm/h;->d:Ljava/lang/String;

    invoke-interface {p2, v0, v1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    sget-object v0, Lfm/b;->f:Llt/b;

    iget-object v1, p1, Lfm/h;->e:Ljava/lang/String;

    invoke-interface {p2, v0, v1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    sget-object v0, Lfm/b;->g:Llt/b;

    iget-object v1, p1, Lfm/h;->f:Ljava/lang/String;

    invoke-interface {p2, v0, v1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    sget-object v0, Lfm/b;->h:Llt/b;

    iget-object v1, p1, Lfm/h;->g:Ljava/lang/String;

    invoke-interface {p2, v0, v1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    sget-object v0, Lfm/b;->i:Llt/b;

    iget-object v1, p1, Lfm/h;->h:Ljava/lang/String;

    invoke-interface {p2, v0, v1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    sget-object v0, Lfm/b;->j:Llt/b;

    iget-object v1, p1, Lfm/h;->i:Ljava/lang/String;

    invoke-interface {p2, v0, v1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    sget-object v0, Lfm/b;->k:Llt/b;

    iget-object v1, p1, Lfm/h;->j:Ljava/lang/String;

    invoke-interface {p2, v0, v1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    sget-object v0, Lfm/b;->l:Llt/b;

    iget-object v1, p1, Lfm/h;->k:Ljava/lang/String;

    invoke-interface {p2, v0, v1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    sget-object v0, Lfm/b;->m:Llt/b;

    iget-object p1, p1, Lfm/h;->l:Ljava/lang/String;

    invoke-interface {p2, v0, p1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    return-void
.end method
