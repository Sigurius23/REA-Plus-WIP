.class public final synthetic Lml1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lml1/b;


# direct methods
.method public synthetic constructor <init>(Lml1/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lml1/a;->w:Lml1/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lml1/a;->w:Lml1/b;

    invoke-static {v0}, Lml1/b$a;->f(Lml1/b;)Lml1/c$b;

    move-result-object v0

    return-object v0
.end method
