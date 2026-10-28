.class public final synthetic Llm0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Llm0/a;

.field public final synthetic x:Llm0/a$b$a;


# direct methods
.method public synthetic constructor <init>(Llm0/a;Llm0/a$b$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llm0/b;->w:Llm0/a;

    iput-object p2, p0, Llm0/b;->x:Llm0/a$b$a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Llm0/b;->w:Llm0/a;

    iget-object v1, p0, Llm0/b;->x:Llm0/a$b$a;

    invoke-static {v0, v1}, Llm0/a$b;->f(Llm0/a;Llm0/a$b$a;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
