.class public abstract Lwz/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/List;

.field public final c:Ll83/p;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 5
    sget-object v0, Lm83/y;->w:Lm83/y;

    .line 6
    invoke-direct {p0, p1, v0}, Lwz/e1;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lwz/e1;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lwz/e1;->b:Ljava/util/List;

    .line 4
    new-instance p1, Lvv1/c;

    const/16 p2, 0x11

    invoke-direct {p1, p0, p2}, Lvv1/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lwz/e1;->c:Ll83/p;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lwz/e1;->c:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
