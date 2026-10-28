.class public final Li3/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lc93/m;

.field public final c:Z


# direct methods
.method public constructor <init>(Lc93/m;Ljava/lang/String;Z)V
    .locals 0

    .line 8
    invoke-direct {p0, p2, p1}, Li3/y;-><init>(Ljava/lang/String;Lc93/m;)V

    .line 9
    iput-boolean p3, p0, Li3/y;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 4
    sget-object v0, Li3/t;->S:Li3/t;

    .line 5
    invoke-direct {p0, p1, v0}, Li3/y;-><init>(Ljava/lang/String;Lc93/m;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Li3/y;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Li3/y;->c:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lc93/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Li3/y;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Li3/y;->b:Lc93/m;

    return-void
.end method


# virtual methods
.method public final a(Li3/z;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Li3/l;

    invoke-virtual {p1, p0, p2}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AccessibilityKey: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Li3/y;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
