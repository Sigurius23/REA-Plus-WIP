.class public abstract Lp3/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final E:Lp3/t;

.field public static final w:Lp3/f;

.field public static final x:Lp3/t;

.field public static final y:Lp3/t;

.field public static final z:Lp3/t;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lp3/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lp3/i;->w:Lp3/f;

    new-instance v0, Lp3/t;

    const-string v1, "sans-serif"

    const-string v2, "FontFamily.SansSerif"

    invoke-direct {v0, v1, v2}, Lp3/t;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lp3/i;->x:Lp3/t;

    new-instance v0, Lp3/t;

    const-string v1, "serif"

    const-string v2, "FontFamily.Serif"

    invoke-direct {v0, v1, v2}, Lp3/t;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lp3/i;->y:Lp3/t;

    new-instance v0, Lp3/t;

    const-string v1, "monospace"

    const-string v2, "FontFamily.Monospace"

    invoke-direct {v0, v1, v2}, Lp3/t;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lp3/i;->z:Lp3/t;

    new-instance v0, Lp3/t;

    const-string v1, "cursive"

    const-string v2, "FontFamily.Cursive"

    invoke-direct {v0, v1, v2}, Lp3/t;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lp3/i;->E:Lp3/t;

    return-void
.end method
