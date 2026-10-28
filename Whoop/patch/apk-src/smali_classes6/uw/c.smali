.class public abstract Luw/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Z

.field public static final b:Luw/b;

.field public static final c:Luw/b;

.field public static final d:Lrw/a;

.field public static final e:Lrw/a;

.field public static final f:Lrw/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    const-string v2, "java.sql.Date"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move v2, v1

    goto :goto_0

    :catch_0
    move v2, v0

    :goto_0
    sput-boolean v2, Luw/c;->a:Z

    if-eqz v2, :cond_0

    new-instance v2, Luw/b;

    const-class v3, Ljava/sql/Date;

    invoke-direct {v2, v0, v3}, Luw/b;-><init>(ILjava/lang/Class;)V

    sput-object v2, Luw/c;->b:Luw/b;

    new-instance v0, Luw/b;

    const-class v2, Ljava/sql/Timestamp;

    invoke-direct {v0, v1, v2}, Luw/b;-><init>(ILjava/lang/Class;)V

    sput-object v0, Luw/c;->c:Luw/b;

    sget-object v0, Luw/a;->c:Lrw/a;

    sput-object v0, Luw/c;->d:Lrw/a;

    sget-object v0, Luw/a;->d:Lrw/a;

    sput-object v0, Luw/c;->e:Lrw/a;

    sget-object v0, Luw/a;->e:Lrw/a;

    sput-object v0, Luw/c;->f:Lrw/a;

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    sput-object v0, Luw/c;->b:Luw/b;

    sput-object v0, Luw/c;->c:Luw/b;

    sput-object v0, Luw/c;->d:Lrw/a;

    sput-object v0, Luw/c;->e:Lrw/a;

    sput-object v0, Luw/c;->f:Lrw/a;

    :goto_1
    return-void
.end method
