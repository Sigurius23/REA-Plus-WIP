.class public abstract Lyy/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lyb3/p;

    const-string v1, "\\*\\*(.*?)\\*\\*"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    new-instance v1, Lyv0/h;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Lyv0/h;-><init>(I)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lyb3/p;

    const-string v1, "__([^_]+)__"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    new-instance v1, Lyv0/h;

    const/16 v3, 0x8

    invoke-direct {v1, v3}, Lyv0/h;-><init>(I)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lyb3/p;

    const-string v1, "\\[([^]]+)]\\(([^)]+)\\)"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    new-instance v1, Lyv0/h;

    const/16 v4, 0x9

    invoke-direct {v1, v4}, Lyv0/h;-><init>(I)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3, v4}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lyy/s;->a:Ljava/util/List;

    return-void
.end method
