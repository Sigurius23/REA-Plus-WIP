.class public abstract Luj/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lyb3/p;

.field public static final b:Lyb3/p;

.field public static final c:Lyb3/p;

.field public static final d:Lyb3/p;

.field public static final e:Lyb3/p;

.field public static final f:Lyb3/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyb3/p;

    const-string v1, "^\\d+(\\.\\d+)?px$"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Luj/l;->a:Lyb3/p;

    new-instance v0, Lyb3/p;

    const-string v1, "rgb\\(from rgb\\((\\d+), (\\d+), (\\d+)\\) r g b / (\\.\\d+)\\)"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Luj/l;->b:Lyb3/p;

    new-instance v0, Lyb3/p;

    const-string v1, "rgb\\(from #([A-Fa-f0-9]{6}|[A-Fa-f0-9]{8}) r g b / (\\.\\d+|\\d+(\\.\\d+)?)\\)"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Luj/l;->c:Lyb3/p;

    new-instance v0, Lyb3/p;

    const-string v1, "color-mix\\(in srgb, rgba?\\((\\d+), (\\d+), (\\d+)(?:, (\\d+(\\.\\d+)?))?\\) (\\d+)%?, (white|black)\\)"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Luj/l;->d:Lyb3/p;

    new-instance v0, Lyb3/p;

    const-string v1, "rgba?\\((\\d+), (\\d+), (\\d+)(?:, (\\d+(\\.\\d+)?))?\\)"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Luj/l;->e:Lyb3/p;

    new-instance v0, Lyb3/p;

    const-string v1, "var\\(--([\\w-]+)\\)"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Luj/l;->f:Lyb3/p;

    return-void
.end method
