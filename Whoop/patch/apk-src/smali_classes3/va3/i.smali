.class public abstract Lva3/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lyb3/p;

.field public static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyb3/p;

    const-string v1, "[^\\p{L}\\p{Digit}]"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lva3/i;->a:Lyb3/p;

    const-string v0, "$context_receiver"

    sput-object v0, Lva3/i;->b:Ljava/lang/String;

    return-void
.end method

.method public static final a(I)Lva3/h;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lva3/i;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    sget-object v0, Lva3/i;->a:Lyb3/p;

    const-string v1, "_"

    invoke-virtual {v0, p0, v1}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
