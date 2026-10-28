.class Lcom/amplitude/quickjs/wrapper/QuickJSContext$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/amplitude/quickjs/wrapper/JSObjectCreator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/amplitude/quickjs/wrapper/QuickJSContext;-><init>(Lcom/amplitude/quickjs/wrapper/JSObjectCreator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/amplitude/quickjs/wrapper/QuickJSContext;

.field final synthetic val$creator:Lcom/amplitude/quickjs/wrapper/JSObjectCreator;


# direct methods
.method public constructor <init>(Lcom/amplitude/quickjs/wrapper/QuickJSContext;Lcom/amplitude/quickjs/wrapper/JSObjectCreator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext$2;->this$0:Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    iput-object p2, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext$2;->val$creator:Lcom/amplitude/quickjs/wrapper/JSObjectCreator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public newArray(Lcom/amplitude/quickjs/wrapper/QuickJSContext;J)Lcom/amplitude/quickjs/wrapper/JSArray;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext$2;->val$creator:Lcom/amplitude/quickjs/wrapper/JSObjectCreator;

    invoke-interface {v0, p1, p2, p3}, Lcom/amplitude/quickjs/wrapper/JSObjectCreator;->newArray(Lcom/amplitude/quickjs/wrapper/QuickJSContext;J)Lcom/amplitude/quickjs/wrapper/JSArray;

    move-result-object p1

    iget-object p2, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext$2;->this$0:Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    invoke-static {p2}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->access$000(Lcom/amplitude/quickjs/wrapper/QuickJSContext;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Ljava/lang/Throwable;

    invoke-direct {p2}, Ljava/lang/Throwable;-><init>()V

    invoke-interface {p1, p2}, Lcom/amplitude/quickjs/wrapper/JSObject;->setStackTrace(Ljava/lang/Throwable;)V

    :cond_0
    iget-object p2, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext$2;->this$0:Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    invoke-static {p2}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->access$100(Lcom/amplitude/quickjs/wrapper/QuickJSContext;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p1
.end method

.method public newFunction(Lcom/amplitude/quickjs/wrapper/QuickJSContext;JJI)Lcom/amplitude/quickjs/wrapper/JSFunction;
    .locals 7

    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext$2;->val$creator:Lcom/amplitude/quickjs/wrapper/JSObjectCreator;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/amplitude/quickjs/wrapper/JSObjectCreator;->newFunction(Lcom/amplitude/quickjs/wrapper/QuickJSContext;JJI)Lcom/amplitude/quickjs/wrapper/JSFunction;

    move-result-object p1

    iget-object p2, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext$2;->this$0:Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    invoke-static {p2}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->access$000(Lcom/amplitude/quickjs/wrapper/QuickJSContext;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Ljava/lang/Throwable;

    invoke-direct {p2}, Ljava/lang/Throwable;-><init>()V

    invoke-interface {p1, p2}, Lcom/amplitude/quickjs/wrapper/JSObject;->setStackTrace(Ljava/lang/Throwable;)V

    :cond_0
    iget-object p2, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext$2;->this$0:Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    invoke-static {p2}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->access$100(Lcom/amplitude/quickjs/wrapper/QuickJSContext;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p1
.end method

.method public newObject(Lcom/amplitude/quickjs/wrapper/QuickJSContext;J)Lcom/amplitude/quickjs/wrapper/JSObject;
    .locals 1

    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext$2;->val$creator:Lcom/amplitude/quickjs/wrapper/JSObjectCreator;

    invoke-interface {v0, p1, p2, p3}, Lcom/amplitude/quickjs/wrapper/JSObjectCreator;->newObject(Lcom/amplitude/quickjs/wrapper/QuickJSContext;J)Lcom/amplitude/quickjs/wrapper/JSObject;

    move-result-object p1

    iget-object p2, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext$2;->this$0:Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    invoke-static {p2}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->access$000(Lcom/amplitude/quickjs/wrapper/QuickJSContext;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Ljava/lang/Throwable;

    invoke-direct {p2}, Ljava/lang/Throwable;-><init>()V

    invoke-interface {p1, p2}, Lcom/amplitude/quickjs/wrapper/JSObject;->setStackTrace(Ljava/lang/Throwable;)V

    :cond_0
    iget-object p2, p0, Lcom/amplitude/quickjs/wrapper/QuickJSContext$2;->this$0:Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    invoke-static {p2}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->access$100(Lcom/amplitude/quickjs/wrapper/QuickJSContext;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p1
.end method
