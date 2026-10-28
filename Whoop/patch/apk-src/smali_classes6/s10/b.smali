.class public abstract Ls10/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcy/b;

.field public static final b:Lcy/b;

.field public static final c:Lcy/b;

.field public static final d:Ls10/c;

.field public static final e:Ls10/c;

.field public static final f:Ls10/c;

.field public static final g:Ls10/c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lcy/b;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lcy/b;-><init>(I)V

    sput-object v0, Ls10/b;->a:Lcy/b;

    new-instance v0, Lcy/b;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lcy/b;-><init>(I)V

    sput-object v0, Ls10/b;->b:Lcy/b;

    new-instance v0, Lcy/b;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lcy/b;-><init>(I)V

    sput-object v0, Ls10/b;->c:Lcy/b;

    new-instance v0, Ls10/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls10/c;-><init>(I)V

    sput-object v0, Ls10/b;->d:Ls10/c;

    new-instance v0, Ls10/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ls10/c;-><init>(I)V

    sput-object v0, Ls10/b;->e:Ls10/c;

    new-instance v0, Ls10/c;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ls10/c;-><init>(I)V

    sput-object v0, Ls10/b;->f:Ls10/c;

    new-instance v0, Ls10/c;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ls10/c;-><init>(I)V

    sput-object v0, Ls10/b;->g:Ls10/c;

    return-void
.end method
