.class public abstract Lng3/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lg73/a;

.field public static final b:Lg73/d;

.field public static final c:Lng3/n;

.field public static final d:Lng3/o;

.field public static final e:Lng3/n;

.field public static final f:Lng3/o;

.field public static final g:Lng3/n;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lg73/a;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lg73/a;-><init>(I)V

    sput-object v0, Lng3/p;->a:Lg73/a;

    new-instance v0, Lg73/d;

    invoke-direct {v0, v1}, Lg73/d;-><init>(I)V

    sput-object v0, Lng3/p;->b:Lg73/d;

    new-instance v0, Lng3/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lng3/n;-><init>(I)V

    sput-object v0, Lng3/p;->c:Lng3/n;

    new-instance v0, Lng3/o;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lng3/o;-><init>(IZ)V

    sput-object v0, Lng3/p;->d:Lng3/o;

    new-instance v0, Lng3/n;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lng3/n;-><init>(I)V

    sput-object v0, Lng3/p;->e:Lng3/n;

    new-instance v0, Lng3/o;

    invoke-direct {v0, v1, v2}, Lng3/o;-><init>(IZ)V

    sput-object v0, Lng3/p;->f:Lng3/o;

    new-instance v0, Lng3/n;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lng3/n;-><init>(I)V

    sput-object v0, Lng3/p;->g:Lng3/n;

    return-void
.end method
