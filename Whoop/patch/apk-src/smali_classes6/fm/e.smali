.class public final Lfm/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llt/c;


# static fields
.field public static final a:Lfm/e;

.field public static final b:Llt/b;

.field public static final c:Llt/b;

.field public static final d:Llt/b;

.field public static final e:Llt/b;

.field public static final f:Llt/b;

.field public static final g:Llt/b;

.field public static final h:Llt/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfm/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lfm/e;->a:Lfm/e;

    const-string v0, "eventTimeMs"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/e;->b:Llt/b;

    const-string v0, "eventCode"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/e;->c:Llt/b;

    const-string v0, "eventUptimeMs"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/e;->d:Llt/b;

    const-string v0, "sourceExtension"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/e;->e:Llt/b;

    const-string v0, "sourceExtensionJsonProto3"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/e;->f:Llt/b;

    const-string v0, "timezoneOffsetSeconds"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/e;->g:Llt/b;

    const-string v0, "networkConnectionInfo"

    invoke-static {v0}, Llt/b;->a(Ljava/lang/String;)Llt/b;

    move-result-object v0

    sput-object v0, Lfm/e;->h:Llt/b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lfm/r;

    check-cast p2, Llt/d;

    check-cast p1, Lfm/k;

    iget-wide v0, p1, Lfm/k;->a:J

    sget-object v2, Lfm/e;->b:Llt/b;

    invoke-interface {p2, v2, v0, v1}, Llt/d;->a(Llt/b;J)Llt/d;

    sget-object v0, Lfm/e;->c:Llt/b;

    iget-object v1, p1, Lfm/k;->b:Ljava/lang/Integer;

    invoke-interface {p2, v0, v1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    sget-object v0, Lfm/e;->d:Llt/b;

    iget-wide v1, p1, Lfm/k;->c:J

    invoke-interface {p2, v0, v1, v2}, Llt/d;->a(Llt/b;J)Llt/d;

    sget-object v0, Lfm/e;->e:Llt/b;

    iget-object v1, p1, Lfm/k;->d:[B

    invoke-interface {p2, v0, v1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    sget-object v0, Lfm/e;->f:Llt/b;

    iget-object v1, p1, Lfm/k;->e:Ljava/lang/String;

    invoke-interface {p2, v0, v1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    sget-object v0, Lfm/e;->g:Llt/b;

    iget-wide v1, p1, Lfm/k;->f:J

    invoke-interface {p2, v0, v1, v2}, Llt/d;->a(Llt/b;J)Llt/d;

    sget-object v0, Lfm/e;->h:Llt/b;

    iget-object p1, p1, Lfm/k;->g:Lfm/v;

    invoke-interface {p2, v0, p1}, Llt/d;->d(Llt/b;Ljava/lang/Object;)Llt/d;

    return-void
.end method
