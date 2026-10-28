.class public final Le4/f;
.super Le4/q;
.source "SourceFile"


# instance fields
.field public final c:Ljava/lang/Object;

.field public final d:Le4/h;

.field public final e:Le4/g;

.field public final f:Le4/h;

.field public final g:Le4/g;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 2

    invoke-direct {p0, p1}, Le4/q;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Le4/f;->c:Ljava/lang/Object;

    new-instance v0, Le4/h;

    const/4 v1, -0x2

    invoke-direct {v0, p1, v1, p0}, Le4/h;-><init>(Ljava/lang/Object;ILe4/f;)V

    iput-object v0, p0, Le4/f;->d:Le4/h;

    new-instance v0, Le4/g;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, p0}, Le4/g;-><init>(Ljava/lang/Object;ILe4/f;)V

    iput-object v0, p0, Le4/f;->e:Le4/g;

    new-instance v0, Le4/h;

    const/4 v1, -0x1

    invoke-direct {v0, p1, v1, p0}, Le4/h;-><init>(Ljava/lang/Object;ILe4/f;)V

    iput-object v0, p0, Le4/f;->f:Le4/h;

    new-instance v0, Le4/g;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1, p0}, Le4/g;-><init>(Ljava/lang/Object;ILe4/f;)V

    iput-object v0, p0, Le4/f;->g:Le4/g;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le4/f;->c:Ljava/lang/Object;

    return-object v0
.end method
