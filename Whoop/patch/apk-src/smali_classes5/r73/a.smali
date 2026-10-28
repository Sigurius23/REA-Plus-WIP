.class public abstract Lr73/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lh6/n;

.field public static final b:Ljc/a;

.field public static final c:Ljc/b;

.field public static final d:Ljc/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh6/n;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lh6/n;-><init>(I)V

    sput-object v0, Lr73/a;->a:Lh6/n;

    new-instance v0, Ljc/a;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Ljc/a;-><init>(I)V

    sput-object v0, Lr73/a;->b:Ljc/a;

    new-instance v0, Ljc/b;

    invoke-direct {v0, v1}, Ljc/b;-><init>(I)V

    sput-object v0, Lr73/a;->c:Ljc/b;

    new-instance v0, Ljc/a;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Ljc/a;-><init>(I)V

    sput-object v0, Lr73/a;->d:Ljc/a;

    return-void
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static b(ILjava/lang/String;)V
    .locals 2

    if-lez p0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, " > 0 required but it was "

    invoke-static {p0, p1, v1}, Lm4/a;->f(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
